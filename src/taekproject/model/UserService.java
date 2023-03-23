package taekproject.model;

import java.util.List;

import taekproject.vo.MenuVO;
import taekproject.vo.OrderVO;
import taekproject.vo.UserVO;

public class UserService {
	
	UserDAO userDao = new UserDAO();
	// 신규회원등록(insert)
	public String userInsert(UserVO user) {
		int result = userDao.userInsert(user);		
		return result>0?"회원가입성공":"회원가입실패";
	}
	// 로그인
	public UserVO userLogin(String user_name, String passwd) {
		UserVO result = userDao.userLogin(user_name, passwd);
		return result;		
	}
	// 주문하기
	public String Order(OrderVO order) {		
		int result = userDao.Order(order);		
		return result>0?"주문성공":"주문실패";
	}
	// 주문내역조회
	public List<OrderVO> SearchOrder(int user_id) {		
		return userDao.SearchOrder(user_id);
	} 
	// 메뉴조회
	public List<MenuVO> selectAllMenu(){		
		return userDao.selectAllMenu();
	}
	// 수정
	public String UserUpdate(UserVO user) {
		int result = userDao.UserUpdate(user);
		return result>0?"수정성공":"수정실패";
	}	
	// 삭제
	public String UserDelete(UserVO user) {	
		int result = userDao.UserDelete(user);
		return result>0?"삭제성공":"삭제실패";
	}	
	
} // UserService
