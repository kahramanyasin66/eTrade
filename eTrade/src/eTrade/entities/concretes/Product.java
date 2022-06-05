package eTrade.entities.concretes;

public class Product {
	
private int id ;
private String name;
private double price ; 
private String description;
private int unitsInStock;
private int categoryId ;
public Product() {
	super();
}
public Product(int id,int categoryId, String name, double price, String description, int unitsInStock  ) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.description = description;
	this.unitsInStock = unitsInStock;
	this.categoryId= categoryId;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getUnitsInStock() {
	return unitsInStock;
}
public void setUnitsInStock(int unitsInStock) {
	this.unitsInStock = unitsInStock;
}


}
