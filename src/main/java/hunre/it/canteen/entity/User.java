package hunre.it.canteen.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String name;

	private Date dateOfBirth;

	private String gender;

	private String address;

	private String email;

	private int phone;

	private String role;

	private String userName;

	private String password;
//"ADMIN", "USER"; "ROLE_ADMIN", "ROLE_USER"
}
