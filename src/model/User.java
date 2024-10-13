package model;

public class User {

	private String fullName;
	private String id;
	private String email;
	private String phone;

	public User(String fullName, String id, String email, String phone) {
		super();
		this.fullName = fullName;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
