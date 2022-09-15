package Assignment24_8;

import java.util.Date;

public class CustomerAccountStatement3 {

	private int caId;
	private int custId;
	private double amount;
	private double deposit_withdrawl;
	private Date deposit_date;
	
	public CustomerAccountStatement3(int caId, int custId, double amount, double deposit_withdrawl, Date deposit_date) {
		super();
		this.caId = caId;
		this.custId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	public int getCaId() {
		return caId;
	}

	public void setCaId(int caId) {
		this.caId = caId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	public void setDeposit_withdrawl(double deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	public Date getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(Date deposit_date) {
		this.deposit_date = deposit_date;
	}

	@Override
	public String toString() {
		return "CustomerAccountStatement [caId=" + caId + ", custId=" + custId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}
	
	
	
}
