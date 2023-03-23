package taekproject.view;

import java.util.List;

import taekproject.vo.MenuVO;
import taekproject.vo.OrderVO;

public class UserView {
	
	public static void print(List<MenuVO> menulist) {
		System.out.println("====메뉴판====");
		
		for(MenuVO menu: menulist) {
			System.out.println(menu);
		}
	}

	public static void print(String message) {
		System.out.println("[알림]" + message);
		
	}
	
	public static void printorder(List<OrderVO> orderlist) {
		System.out.println();
		System.out.println("====주문내역조회====");
		if(orderlist==null) {
			print("주문내역이 존재하지 않습니다");
		}else {
			System.out.println(orderlist);
		}
	}
	
	

}
