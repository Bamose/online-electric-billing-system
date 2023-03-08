package controller;

public class resident {
	String uname, email,phone,address,password;

	public resident() {
		super();
	}

	public resident(String uname, String email, String phone, String address, String password) {
		super();
		this.uname = uname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.password = password;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
