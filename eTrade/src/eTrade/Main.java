package eTrade;

import java.util.ArrayList;

import java.util.List;
import eTrade.business.concretes.ProductManager;
import eTrade.dataAccess.abstracts.ProductRepository;
import eTrade.dataAccess.concretes.hibernate.HibernateProductRepository;
import eTrade.dataAccess.concretes.jdbcImpls.JdbcProductRepository;
import eTrade.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,1,"Elma",15.5,"Amasyanýn Elmasý",5);
		Product product2 = new Product(2,1,"Armut",15.8,"Güzel Armut",9);
		Product product3 = new Product(3,1,"Elma",-15.9,"Hoþ Ayva",10);
		
		List<Product> products = new ArrayList<Product>();
		products.add(product1);
		products.add(product2);
		products.add(product3);		
		
		
		ProductRepository productRepositories = new HibernateProductRepository() ;	
		//ProductRepository productRepositories2 = new JdbcProductRepository(products) ;	

		
		ProductManager productManager = new ProductManager(productRepositories);
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);		
	

	}

}
