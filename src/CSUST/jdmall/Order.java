package CSUST.jdmall;

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
	
}
