package CSUST.jdmall;

/**
 * 
 * @author Amy_oyzl
 *
 */
public class App {

	public static void main(String[] args) {

		// 初始化
		// TODO 9个商品、4个厂商、3个分类
		Company c1 = new Company("小米");
		Company c2 = new Company("苹果");
		Company c3 = new Company("百草味");
		Company c4 = new Company("以纯");
		Category ct1 = new Category("服装");
		Category ct2 = new Category("电子产品");
		Category ct3 = new Category("食品");
		Product p1 = new Product("小米6", 1999, c1, ct2);
		Product p2 = new Product("小米手环", 149, c1, ct2);
		Product p3 = new Product("小米耳机", 56, c1, ct2);
		Product p4 = new Product("外套", 159, c4, ct1);
		Product p5 = new Product("衬衫", 126, c1, ct1);
		Product p6 = new Product("坚果礼盒", 98, c3, ct3);
		Product p7 = new Product("肉脯礼盒", 125, c3, ct3);
		Product p8 = new Product("果脯礼盒", 85, c3, ct3);
		Product p9 = new Product("Iphone", 4999, c2, ct2);
		
//		c1.showInfo();
//		c2.showInfo();
//		c3.showInfo();
//		c4.showInfo();
//		p3.print();
//		p9.print();
		ct1.showInfo();
		ct2.showInfo();
		ct3.showInfo();

		// TODO 2个用户买东西
		Account alice = new Account("alice");
		Order oa1 = new Order(alice, "湖南省长沙市天心区长沙理工大学");
		oa1.addItem(new Item(p1,3));
		oa1.addItem(new Item(p2));
		oa1.addItem(new Item(p6,6));
		Order oa2 = new Order(alice, "湖北省武汉市浙江大学");
		oa2.addItem(new Item(p9));
//		alice.addOrder(oa1);
//		alice.addOrder(oa2);
		alice.showOrders();
		
		Account jack = new Account("jack");
		Order oj1 = new Order(jack,"浙江省杭州市浙江大学");
		oj1.addItem(new Item(p3,1));
		oj1.addItem(new Item(p7,3));
		oj1.addItem(new Item(p5,3));
		Order oj2 = new Order(jack,"北京清华大学");
		oj2.addItem(new Item(p4,2));
		oj2.addItem(new Item(p8,5));
//		jack.addOrder(oj1);
//		jack.addOrder(oj2);
		jack.showOrders();
		
	}

}
