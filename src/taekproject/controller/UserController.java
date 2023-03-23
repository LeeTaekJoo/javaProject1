package taekproject.controller;

import java.util.List;
import java.util.Scanner;

import taekproject.model.UserService;
import taekproject.view.UserView;
import taekproject.vo.MenuVO;
import taekproject.vo.OrderVO;
import taekproject.vo.UserVO;

public class UserController {
	static UserVO user = null;
	static MenuVO menu = null;
	static OrderVO order = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserService uService = new UserService();

		while (true) {
			System.out.println();
			System.out.println("Cafe Order Program======================================");
			System.out.println("1.회원가입|2.로그인|3.메뉴판|4.주문|5.마이페이지|6.종료");
			System.out.println("========================================================");
			System.out.print("====작업선택>>");
			String func = sc.next();
			
			if(func.equals("6")) break;
			
			switch (func) {
			case "1": {
				UserVO user = makeUser(sc);
				UserView.print(uService.userInsert(user));
				break;
			}
			case "2": {
				System.out.print("아이디 >> ");
				String user_name = sc.next();
				System.out.print("비밀번호 >> ");
				String passwd = sc.next();
				user = uService.userLogin(user_name, passwd);
				UserView.print(user == null ? "로그인실패" : "로그인성공");
				break;
			}
			case "3": {
				UserView.print(uService.selectAllMenu());
				break;
			}
			case "4": {
				OrderVO order = makeOrder(sc);
				UserView.print(uService.Order(order));
				break;
			}
			
			// 마이페이지
			case "5": { // 마이페이지
				System.out.println();
				System.out.println("=============마이페이지=============");
				System.out.println("1.주문내역|2.개인정보수정|3.회원탈퇴");
				System.out.println("====================================");
				System.out.print("====작업선택>>");
				String func1 = sc.next();
							
				switch (func1) {
				case "1": { // 주문내역
					List<OrderVO> orderlist = uService.SearchOrder(user.getUser_id());
					if(orderlist.size()==0) {
						System.out.println("주문내역이 존재하지 않습니다.");
					}else {
						UserView.printorder(orderlist);
					}
					break;
				}
				case "2": { // 수정하기
					UserVO user = makeUpdate(sc);
					UserView.print(uService.UserUpdate(user));
					
					break;
				}
				case "3": { // 삭제하기(회원탈퇴)
					System.out.print("회원탈퇴하시겠습니까(Y/N)?>>");
					String yn = sc.next();
					if(yn.equals("Y")){
						UserView.print(uService.UserDelete(user));
					}			
				}
				}
			} 
			default:
				break;
			}
		}
		System.out.println();
		System.out.println("수고하셨습니다...");
	}

	private static UserVO makeUser(Scanner sc) {
		System.out.print("1. 유저아이디 >> ");
		String userID = sc.next();
		System.out.print("2. 패스워드 >> ");
		String pass = sc.next();
		System.out.print("3. 이메일 >> ");
		String email = sc.next();
		System.out.print("4. 전화번호 >> ");
		String phone = sc.next();

		UserVO user = new UserVO();
		user.setUser_name(userID);
		user.setPasswd(pass);
		user.setE_mail(email);
		user.setPhone(phone);
		user.setUpdate_at(null);

		return user;
	} // makeUser

	private static OrderVO makeOrder(Scanner sc) {
		System.out.print("메뉴번호>");
		int menu_id = sc.nextInt();
		System.out.print("수량>");
		int quantity = sc.nextInt();

		OrderVO order = new OrderVO();
		order.setUser_id(user.getUser_id());
		order.setMenu_id(menu_id);
		order.setQuantity(quantity);

		return order;
	} // makeOrder

	private static UserVO makeUpdate(Scanner sc) {
		System.out.print("1. 유저아이디 >> ");
		String user_name = sc.next();
		System.out.print("2. 패스워드 >> ");
		String passwd = sc.next();
		System.out.print("3. 이메일 >> ");
		String e_mail = sc.next();
		System.out.print("4. 전화번호 >> ");
		String phone = sc.next();

		user.setUser_name(user_name);
		user.setPasswd(passwd);
		user.setE_mail(e_mail);
		user.setPhone(phone);
		user.setUpdate_at(user.getUpdate_at());

		return user;
	} // makeUpdate

} // end class
