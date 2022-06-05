package eTrade.dataAccess.concretes.hibernate;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.ProductRepository;
import eTrade.entities.concretes.Product;

public class HibernateProductRepository implements ProductRepository {
	
	List<Product> products ; 

	public HibernateProductRepository() {
		products = new ArrayList<Product>();		
	}

	@Override
	public void add(Product product) {
		products.add(product);
	System.out.println("Hibernate ile eklendi  "+product.getName());
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
