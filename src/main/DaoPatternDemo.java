package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

public class DaoPatternDemo {
	public static void main(String args[]) {
		ProductService p = new ProductServiceImpl();
		//display
		List<Product> prodli = p.getProductList();
		System.out.println();
		System.out.println();
		for(Product pi : prodli) {
			System.out.println(pi);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println();
		
		//Adding products
		List<Product> newList = new ArrayList<>();
		newList.add(new Product(4, "Printer", 10000));
		newList.add(new Product(5, "Bag", 50000));
		newList.add(new Product(6, "Cup", 100));
		p.addProductList(newList);
		prodli = p.getProductList();
		for(Product pi : prodli) {
			System.out.println(pi);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println();
		
		//Deleting a product from the data
		p.deleteProduct(5);
		prodli = p.getProductList();
		for(Product pi : prodli) {
			System.out.println(pi);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println();
		
		//Updating a product in the data
		Product pd = prodli.get(1);
		pd.setName("Pump");
		p.updateProduct(pd);
		prodli = p.getProductList();
		for(Product pi : prodli) {
			System.out.println(pi);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println();
		
		//On above code use lambda expression to find those products whose price is
		//greater than 30000 , sort them and store in another list and display it
		List<Product> list = prodli.stream().filter(p1->p1.getPrice()>30000).sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
		for(Product li : list) {
			System.out.println(li);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		System.out.println();
		
	}
}
