package controller;

public class reciept {
	String paid_amount, month, email, Accountnumber, paymentmethod, phonenumber;

	public reciept() {
		super();
	}

	public reciept(String paid_amount, String month, String email, String accountnumber, String paymentmethod,
			String phonenumber) {
		super();
		this.paid_amount = paid_amount;
		this.month = month;
		this.email = email;
		this.Accountnumber = accountnumber;
		this.paymentmethod = paymentmethod;
		this.phonenumber = phonenumber;
	}

	public String getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(String paid_amount) {
		this.paid_amount = paid_amount;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountnumber() {
		return Accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		Accountnumber = accountnumber;
	}

	public String getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	} 
}
