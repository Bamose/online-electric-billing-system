package controller;

public class commercialmember {
	String uname,cname, email,phone,address,password;

	public commercialmember() {
		super();
	}

	public commercialmember(String uname, String cname, String email, String phone, String address, String password) {
		super();
		this.uname = uname;
		this.cname = cname;
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

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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
