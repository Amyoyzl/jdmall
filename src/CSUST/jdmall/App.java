package CSUST.jdmall;

import java.util.ArrayList;

/**
 * 
 * @author Amy_oyzl
 *
 */
public class App {

	public static void main(String[] args) {

		// 初始化
		// TODO 9个商品、4个厂商、3个分类
		Product p1 = new Product("小米6", 1999);
		Product p2 = new Product("小米手环", 149);
		Product p3 = new Product("小米耳机", 56);
		Product p4 = new Product("外套", 249);
		Product p5 = new Product("鞋子", 159);
		Product p6 = new Product("衬衫", 126);
		Product p7 = new Product("坚果礼盒", 98);
		Product p8 = new Product("肉脯礼盒", 125);
		Product p9 = new Product("果冻", 34);

		ArrayList<Product> pa = new ArrayList<>();
		pa.add(p1);
		pa.add(p2);
		pa.add(p3);
		ArrayList<Product> pb = new ArrayList<>();
		pb.add(p4);
		pb.add(p5);
		pb.add(p6);
		ArrayList<Product> pc = new ArrayList<>();
		pc.add(p7);
		pc.add(p8);
		ArrayList<Product> pd = new ArrayList<>();
		pd.add(p9);
		pc.add(p9);
		Company cp1 = new Company("小米", pa);
		Company cp2 = new Company("以纯", pb);
		Company cp3 = new Company("百草味", pc);
		Company cp4 = new Company("喜之郎", pd);
		Category ct1 = new Category("数码电器", pa);
		Category ct2 = new Category("服装", pb);
		Category ct3 = new Category("食品", pc);

		// p1.showInfo();
		// p2.showInfo();
		// p3.showInfo();
		// p4.showInfo();
		// p5.showInfo();
		// p6.showInfo();
		// p7.showInfo();
		// p8.showInfo();
		// p9.showInfo();
		// cp1.showInfo();
		ct1.showInfo();
		ct2.showInfo();
		ct3.showInfo();

		// TODO 2个用户买东西
		ArrayList<Item> it1 = new ArrayList<>();
		it1.add(new Item(p1, 1));
		it1.add(new Item(p5, 3));
		it1.add(new Item(p6, 5));
		ArrayList<Item> it2 = new ArrayList<>();
		it2.add(new Item(p2, 1));
		it2.add(new Item(p4, 6));
		it2.add(new Item(p7, 3));
		ArrayList<Item> it3 = new ArrayList<>();
		it3.add(new Item(p5, 2));
		it3.add(new Item(p8, 3));
		ArrayList<Item> it4 = new ArrayList<>();
		it4.add(new Item(p1, 2));
		it4.add(new Item(p9, 3));
		it4.add(new Item(p3, 3));
		ArrayList<Item> it5 = new ArrayList<>();
		it5.add(new Item(p6, 3));
		it5.add(new Item(p4, 2));
		ArrayList<Order> ola = new ArrayList<>();
		ArrayList<Order> olb = new ArrayList<>();
		Account rose = new Account("alice", ola);
		Account jack = new Account("jack", olb);
		ola.add(new Order(rose, "湖南省长沙市天心区长沙理工大学", it1));
		ola.add(new Order(rose, "湖南省长沙市天心区长沙理工大学", it2));
		olb.add(new Order(jack, "湖北省武汉市浙江大学", it3));
		olb.add(new Order(jack, "湖北省武汉市浙江大学", it4));
		olb.add(new Order(jack, "湖北省武汉市浙江大学", it5));

		rose.showOrders();
		jack.showOrders();

	}

}
