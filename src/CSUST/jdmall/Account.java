package CSUST.jdmall;

import java.util.ArrayList;

/**
 * 账号
 * 
 * @author Amy_oyzl
 *
 */
public class Account {

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 用户的订单
	 */
	private ArrayList<Order> orders = new ArrayList<>();

	/**
	 * @param name
	 * @param orders
	 */
	public Account(String name, ArrayList<Order> orders) {
		this.name = name;
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	public void showOrders() {
		System.out.println("***********************************************");
		System.out.printf("%s 的订单：\n", name);
		for (Order e : orders) {
			e.showInfo();
		}
		System.out.println("***********************************************");
	}

}
