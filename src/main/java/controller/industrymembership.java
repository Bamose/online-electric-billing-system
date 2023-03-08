package controller;

public class industrymembership {
	String uname,Iname, email,phone,address,password;

	public industrymembership() {
		super();
	}

	public industrymembership(String uname, String iname, String email, String phone, String address, String password) {
		super();
		this.uname = uname;
		this.Iname = iname;
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

	public String getIname() {
		return Iname;
	}

	public void setIname(String iname) {
		Iname = iname;
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
