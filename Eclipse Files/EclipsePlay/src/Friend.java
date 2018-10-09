/**
 * @author Mark Baldwin
 *
 */
public class Friend {
	private String name;
	private String email;

	//Default constructor
	public Friend() {
		super();
	}

	//2-parameter constructor
	public Friend(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	//email getter
	public String getEmail() {
		return email;
	}

	//email setter
	public void setEmail(String email) {
		this.email = email;
	}

	//name getter
	public String getName() {
		return name;
	}

//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", email=" + email + "]";
//	}





}

