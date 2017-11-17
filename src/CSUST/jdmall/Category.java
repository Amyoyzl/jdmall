package CSUST.jdmall;

import java.util.ArrayList;

/**
 * 产品分类
 * 
 * @author Amy_oyzl
 *
 */
public class Category {

	/**
	 * 分类名
	 */
	private String title;

	/**
	 * 属于该分类的产品
	 */
	private ArrayList<Product> products = new ArrayList<>();

	/**
	 * @param title
	 * @param products
	 */
	public Category(String title, ArrayList<Product> products) {
		this.title = title;
		this.products = products;
		for (Product e : products) {
			e.setCategory(this);
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public void showInfo() {
		for(Product e : products) {
			e.print();
		}
	}

}
