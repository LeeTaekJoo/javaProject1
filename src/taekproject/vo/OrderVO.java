package taekproject.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class OrderVO {

	private int order_code;
	private int user_id;
	private int menu_id;
	private Date order_date;
	private int quantity;
	
	@Override
	public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(" 주문코드: ").append(order_code)
	.append(" 회원번호: ").append(user_id)
	.append(" 메뉴번호: ").append(menu_id)
	.append(" 주문일: ").append(order_date)
	.append(" 수량: ").append(quantity)
	.append("\n")
	.append("-------------------------------------------------------------------") 
	.append("\n");
	return builder.toString();
	} // toString
	
} // OrderVO
