package CSUST.jdmall;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 订单
 * 
 * @author Amy_oyzl
 *
 */
public class Order {

	/**
	 * 账户
	 */
	private Account account;

	/**
	 * 时间
	 */
	private Date time;

	/**
	 * 账户的地址
	 */
	private String address;

	/**
	 * 总金额
	 */
	private double totalMoney;

	/**
	 * 订单项
	 */
	private ArrayList<Item> item = new ArrayList<>();

	/**
	 * @param account
	 * @param address
	 * @param item
	 */
	public Order(Account account, String address, ArrayList<Item> item) {
		this.account = account;
		this.address = address;
		this.item = item;
		time = new Date();
		for (Item e : item) {
			totalMoney += e.getProduct().getPrice() * e.getQuantity();
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Item> getItem() {
		return item;
	}

	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}

	public Account getAccount() {
		return account;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public String getTime() {
		// return time.toLocaleString();
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		return format.format(time);
	}

	public void showInfo() {
		System.out.println("时间：" + getTime());
		System.out.println("地址：" + address);
		System.out.println("详细信息：");
		for(Item e : item) {
			e.showInfo();
		}
		System.out.println("总金额：" + totalMoney);
		System.out.println("-----------------------------------------------");
	}

}
