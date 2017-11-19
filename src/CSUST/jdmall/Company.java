package CSUST.jdmall;

import java.util.ArrayList;

/**
 * 产品的生产商
 * 
 * @author Amy_oyzl
 *
 */
public class Company {

	/**
	 * 生产商
	 */
	private String name;

	/**
	 * 产品列表
	 */
	private ArrayList<Product> products = new ArrayList<>();

	/**
	 * @param name
	 * @param products
	 */

	public Company(String name) {
		this.name = name;
	}

	/**
	 * 添加新的产品
	 * 
	 * @param product
	 */
	public void addProduct(Product product) {
		products.add(product);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void showInfo() {
		for (Product e : products) {
			e.print();
		}
	}

}
