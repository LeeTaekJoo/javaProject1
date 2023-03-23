package taekproject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shinhan.db.OracleUtil;

import taekproject.vo.MenuVO;
import taekproject.vo.OrderVO;
import taekproject.vo.UserVO;

public class UserDAO {

	Connection conn;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	int resultCount;

	// 회원가입
	public int userInsert(UserVO user) {

		String sql = """
				insert into User_t values(user_seq.nextval,?,?,?,?,sysdate,?)
				""";
		conn = OracleUtil.getConnection();

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getUser_name());
			pst.setString(2, user.getPasswd());
			pst.setString(3, user.getE_mail());
			pst.setString(4, user.getPhone());
			pst.setDate(5, user.getCreate_at());
//			pst.setDate(6, user.getUpdate_at());

			resultCount = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			OracleUtil.dbDisconnect(null, pst, conn);
		}

		return resultCount;
	}

	// 로그인
	public UserVO userLogin(String user_name, String passwd) {

		String sql = """
				select *
				 from User_t where user_name = ? and passwd = ?
				""";
		UserVO user = null;
		conn = OracleUtil.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, user_name);
			pst.setString(2, passwd);

			rs = pst.executeQuery();

			if (rs.next()) {
				user = new UserVO();
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_name(rs.getString("user_name"));
				user.setPasswd(rs.getString("passwd"));
				user.setE_mail(rs.getString("e_mail"));
				user.setPhone(rs.getString("phone"));
				user.setCreate_at(rs.getDate("create_at"));
				user.setUpdate_at(rs.getDate("update_at"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			OracleUtil.dbDisconnect(rs, pst, conn);
		}
		return user;
	}

	// 메뉴판 검색
	public List<MenuVO> selectAllMenu() {
		String sql = """
				select *
				from CoffeeMenu
				order by 1
				""";
		List<MenuVO> menulist = new ArrayList<>();
		conn = OracleUtil.getConnection();

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				MenuVO menu = makeMenu(rs);
				menulist.add(menu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			OracleUtil.dbDisconnect(rs, pst, conn);
		}
		return menulist;
	} // selectAllMenu

	// 주문하기
	public int Order(OrderVO order) {
		String sql = """
				insert into CoffeeOrder
				( order_code, user_id, menu_id, order_date, quantity )
				values
				( order_seq.nextval, ?, ?, sysdate, ? )
				""";
		conn = OracleUtil.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, order.getUser_id());
			pst.setInt(2, order.getMenu_id());
			pst.setInt(3, order.getQuantity());
			resultCount = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			OracleUtil.dbDisconnect(rs, pst, conn);
		}
		return resultCount;
	} // Order

	// 주문내역 조회
	public List<OrderVO> SearchOrder(int user_id) {
		String sql = "select * from CoffeeOrder where user_id=?";

		conn = OracleUtil.getConnection();

		List<OrderVO> orderlist = new ArrayList<>();

		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, user_id);
			rs = pst.executeQuery();
			while (rs.next()) {
				OrderVO order = makeOrder(rs);
				orderlist.add(order);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			OracleUtil.dbDisconnect(rs, pst, conn);
		}
		return orderlist;

	} // SearchOrder

	// 수정하기
	public int UserUpdate(UserVO user) {
		// 로그인한 내정보 수정
		String sql = """
				update User_t
				set user_name=?, passwd=?, e_mail=?, phone=?, update_at=sysdate
				where user_id=?
				""";
		conn = OracleUtil.getConnection();
		try {
			pst = conn.prepareStatement(sql);

			pst.setString(1, user.getUser_name());
			pst.setString(2, user.getPasswd());
			pst.setString(3, user.getE_mail());
			pst.setString(4, user.getPhone());
			pst.setInt(5, user.getUser_id());

			resultCount = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			OracleUtil.dbDisconnect(null, pst, conn);
		}
		return resultCount;
	} // UserUpdate

	// 회원탈퇴
	public int UserDelete(UserVO user) {
		// 현재 로그인한 내정보 삭제
		String sql = """
				delete from User_t
				where user_id = ?
				""";
		conn = OracleUtil.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, user.getUser_id());

			resultCount = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			OracleUtil.dbDisconnect(null, pst, conn);
		}

		return resultCount;
	} // UserDelete

	private MenuVO makeMenu(ResultSet rs) throws SQLException {
		MenuVO menu = new MenuVO();

		menu.setMenu_id(rs.getInt("Menu_id"));
		menu.setMenu_name(rs.getString("Menu_name"));
		menu.setCoffee_size(rs.getString("Coffee_size"));
		menu.setPrice(rs.getInt("Price"));
		menu.setCreate_at(rs.getDate("Create_at"));

		return menu;
	} // makeMenu

	private OrderVO makeOrder(ResultSet rs) throws SQLException {
		OrderVO order = new OrderVO();

		order.setOrder_code(rs.getInt("Order_code"));
		order.setUser_id(rs.getInt("User_id"));
		order.setMenu_id(rs.getInt("Menu_id"));
		order.setOrder_date(rs.getDate("Order_date"));
		order.setQuantity(rs.getInt("Quantity"));

		return order;
	} // makeOrder

} // end class
