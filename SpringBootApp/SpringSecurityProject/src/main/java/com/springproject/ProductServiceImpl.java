package com.springproject;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

	List<Product> productslist = new ArrayList<Product>();
	int productid =1;
	
	public ProductServiceImpl(){
	Product product = new Product();
	product.setId(productid);
	product.setDescription("Spring security project");
	productslist.add(product);
	}
	@Override
	public List<Product> getProducts() {
		
		return productslist;
	}

	@Override
	public int addProduct(Product product) {
		product.setId(++productid);
		productslist.add(product);
		return productid;
	}

}
