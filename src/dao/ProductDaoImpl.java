package dao;

import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductDaoImpl implements ProductDao{

	List<Product> products;
	public ProductDaoImpl() {
		products = new ArrayList<>();
		Product p1 = new Product(0, "Van", 500000);
		Product p2 = new Product(1, "Fan", 5000);
		Product p3 = new Product(2, "Chair", 1000);
		Product p4 = new Product(3, "Laptop", 75000);
		products.add(p1);
		products.add(p2);
		products.add(p3);
	}
	
	@Override
	public List<Product> getProductList() {
		return products;
	}

	@Override
	public void addProductList(List<Product> p) {
		for(int i=0; i<p.size(); i++) {
			products.add(p.get(i));
		}
	}

	@Override
	public void deleteProduct(int id) {
		products.remove(id);
	}

	@Override
	public void updateProduct(Product product) {
		products.get(product.getId()).setName(product.getName());
	}
	
}
