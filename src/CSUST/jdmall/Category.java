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

}
