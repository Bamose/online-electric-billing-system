package controller;

public class admintable {
	String Name, Email, Address, paid_amount;

	public admintable() {
		super();
	}

	public admintable(String name, String email, String address, String paid_amount) {
		super();
		this.Name = name;
		this.Email = email;
		this.Address = address;
		this.paid_amount = paid_amount;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(String paid_amount) {
		this.paid_amount = paid_amount;
	}
}
