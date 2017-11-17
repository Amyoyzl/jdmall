package CSUST.jdmall;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * 商品
 * 
 * @author Amy_oyzl
 *
 */
public class Product {

	/**
	 * 商品名
	 */
	private String title;

	/**
	 * 商品价格
	 */
	// private BigDecimal price;
	private double price; // 用浮点数会丢失精度

	/**
	 * 商品的厂商
	 */
	private Company company;

	/**
	 * 商品所属分类
	 */
	private Category category;

	/**
	 * @param title
	 * @param price
	 * @param company
	 * @param category
	 */
	public Product(String title, double price, Company company, Category category) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.category = category;
	}

	/**
	 * @param title
	 * @param price
	 */
	public Product(String title, double price) {
		this.title = title;
		this.price = price;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void print() {
		System.out.println(title + ":" + price + 
				" \t厂商：" + company.getName() + 
				"    \t分类：" + category.getTitle());
	}

}
