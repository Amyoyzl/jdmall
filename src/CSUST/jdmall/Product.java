package CSUST.jdmall;

import java.math.BigDecimal;

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

}
