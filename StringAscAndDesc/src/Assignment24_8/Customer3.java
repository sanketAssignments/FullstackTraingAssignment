package Assignment24_8;

import java.util.Date;

public class Customer3 {
	private int custId;
	private String accountno;
	private String custname;
	private String cust_address;
	private Date cust_dob;
	private Date custAccountOpeningDate;
	private Branch3 Branch_Obj;

	public Customer3(int custId, String accountno, String custname, String cust_address, Date cust_dob,
			Date custAccountOpeningDate, Branch3 branch_Obj) {
		super();
		this.custId = custId;
		this.accountno = accountno;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.custAccountOpeningDate = custAccountOpeningDate;
		Branch_Obj = branch_Obj;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public Date getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(Date cust_dob) {
		this.cust_dob = cust_dob;
	}

	public Date getCustAccountOpeningDate() {
		return custAccountOpeningDate;
	}

	public void setCustAccountOpeningDate(Date custAccountOpeningDate) {
		this.custAccountOpeningDate = custAccountOpeningDate;
	}

	public Branch3 getBranch_Obj() {
		return Branch_Obj;
	}

	public void setBranch_Obj(Branch3 branch_Obj) {
		Branch_Obj = branch_Obj;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accountno=" + accountno + ", custname=" + custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", custAccountOpeningDate=" + custAccountOpeningDate
				+ ", Branch_Obj=" + Branch_Obj + "]";
	}

}
