package eTrade.dataAccess.concretes.jdbcImpls;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.ProductRepository;
import eTrade.entities.concretes.Product;

public class JdbcProductRepository implements ProductRepository {
	
	List<Product> products ; 
	public JdbcProductRepository () {
		super();
		products = new ArrayList<Product>();
	}

	@Override
	public void add(Product product) {
		products.add(product);
		System.out.println("Jdbc ile Eklendi");
		
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
