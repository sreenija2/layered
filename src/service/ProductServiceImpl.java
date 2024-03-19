package service;

import java.util.List;

import dao.ProductDao;
import dao.ProductDaoImpl;
import model.Product;

public class ProductServiceImpl implements ProductService{

	ProductDao dao;
	public ProductServiceImpl() {
		dao = new ProductDaoImpl();
	}
	@Override
	public List<Product> getProductList() {
		return dao.getProductList();
	}

	@Override
	public void addProductList(List<Product> p) {
		dao.addProductList(p);
	}

	@Override
	public void deleteProduct(int id) {
		dao.deleteProduct(id);
	}

	@Override
	public void updateProduct(Product product) {
		dao.updateProduct(product);
	}
	
}
