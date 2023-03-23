package taekproject.view;

import java.util.List;

import taekproject.vo.MenuVO;
import taekproject.vo.OrderVO;

public class UserView {
	
	public static void print(List<MenuVO> menulist) {
		System.out.println("====메뉴판====");
		for(MenuVO menu: menulist) {
			System.out.println(menu);
		} // for
	} // print menulist

	public static void print(String message) {
		System.out.println("[알림]" + message);	
	} // print message
	
	public static void printorder(List<OrderVO> orderlist) {
		System.out.println();
		System.out.println("====주문내역조회====");
		
		System.out.println(orderlist);	
	} // printorder
} // UserView
