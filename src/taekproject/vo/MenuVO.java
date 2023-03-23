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
public class MenuVO {
	private int menu_id;
	private String menu_name;
	private String coffee_size;
	private int price;
	private Date create_at;

} // MenuVO
