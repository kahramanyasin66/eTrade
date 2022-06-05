package eTrade.business.concretes;

import java.util.List;

import eTrade.business.abstracts.ProductService;
import eTrade.dataAccess.abstracts.ProductRepository;
import eTrade.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public void add(Product product) {

		if (checkIfProductNameExists(product.getName())) {
			System.out.println("Ayn� isimde �r�n bulunmaktad�r eklenemez !");
			return;
		}
		if (product.getPrice() <= 0) {
			System.out.println("0 Fiyatl� �r�n olamaz !");
			return;

		} 
		if(countOfCategoryId(product)>=5) {
			System.out.println("Bir Kategoriye %'ten fazla �r�n eklenemez !");
			return;
		}
		else {
			productRepository.add(product);
		}

	}

	@Override
	public void delete(Product product) {

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAll() {

		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) { // delete i�in
		Product productToFind = null;
		for (Product item : productRepository.getAll()) {
			if (item.getId() == id) {
				productToFind = item;
			}
		}
		return productToFind;
	}


	private boolean checkIfProductNameExists(String productName) { // add i�in
		boolean exists = false;
		for (Product p : productRepository.getAll()) {
			if (p.getName() == productName) {
				exists = true;
			}

		}
		return exists;
	}
	private int countOfCategoryId(Product product) {
		int count=0 ;
		for (Product categoryCount : productRepository.getAll()) {
			if (categoryCount.getCategoryId() == product.getCategoryId()) {
				count++;
			}
		}
		
		return count ;
	}



}
