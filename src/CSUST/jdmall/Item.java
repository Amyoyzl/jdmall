package CSUST.jdmall;

/**
 * 订单项
 * 
 * @author Amy_oyzl
 *
 */
public class Item {

	/**
	 * 商品
	 */
	private Product product;

	/**
	 * 数量
	 */
	private int quantity;

	/**
	 * @param product
	 * @param quantity
	 */
	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void showInfo() {
		System.out.printf("%s *%d   \t单价：%.2f\t小计：%.2f\n", 
				product.getTitle(), quantity, product.getPrice(),
				product.getPrice() * quantity);
	}

}
