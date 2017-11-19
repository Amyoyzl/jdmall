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
	private ArrayList<Item> items = new ArrayList<>();
	
	public Order(Account account, String address) {
		this.account = account;
		account.addOrder(this);
		this.address = address;
		time = new Date();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Item> getItem() {
		return items;
	}

	public void setItem(ArrayList<Item> item) {
		this.items = item;
	}

	public Account getAccount() {
		return account;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public String getTime() {
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm");
		return format.format(time);
	}

	public void showInfo() {
		System.out.println("时间：" + getTime());
		System.out.println("地址：" + address);
		System.out.println("详细信息：");
		for(Item e : items) {
			e.showInfo();
		}
		System.out.println("总金额：" + totalMoney);
		System.out.println("-----------------------------------------------");
	}

	public void addItem(Item item) {
		totalMoney = totalMoney + item.getProduct().getPrice()*item.getQuantity();
		items.add(item);
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
