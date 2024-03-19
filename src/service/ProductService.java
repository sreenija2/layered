package service;

import java.util.List;

import model.Product;

public interface ProductService {
	public List<Product> getProductList();
	
	public void addProductList(List<Product> p);
	
	public void deleteProduct(int id);
	
	public void updateProduct(Product product);
}
