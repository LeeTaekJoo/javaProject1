package taekproject.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class MenuVO {
	private int menu_id;
	private String menu_name;
	private String coffee_size;
	private int price;
	private Date create_at;
	
	@Override
	public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append(" 메뉴번호: ").append(menu_id)
	.append(" 메뉴이름: ").append(menu_name)
	.append(" 사이즈: ").append(coffee_size)
	.append("\n")
	.append(" 가격: ").append(price+"원")
	.append(" 메뉴만든날: ").append(create_at)
	.append("\n")
	.append("------------------------------------------------------") ;
	return builder.toString();
	} // toString

} // MenuVO
