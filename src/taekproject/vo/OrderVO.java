package taekproject.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class OrderVO {

	private int order_code;
	private int user_id;
	private int menu_id;
	private Date order_date;
	private int quantity;
	
}
