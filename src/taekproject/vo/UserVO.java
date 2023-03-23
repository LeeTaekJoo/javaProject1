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
public class UserVO {
	private int user_id;
	private String user_name;
	private String passwd;
	private String e_mail;
	private String phone;
	private Date create_at;
	private Date update_at;

} // UserVO
