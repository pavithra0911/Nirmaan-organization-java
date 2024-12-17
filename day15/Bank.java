package day15;

public class Bank {
	private long accountNo=41378;
	private String accHolderName="pavithra";
	private int accBal=10000;
	private int pin=8970;
	
	public long getAcccountNo() {
		return accountNo;
	}
	public  void setAccountNo(long accountNo) {
		this.accountNo=accountNo;
		
	}
	public String getAccHolderName() {
		return accHolderName;
		}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName=accHolderName;
		}
	public int getAccBal() {
		return accBal;
	}
public int setAccBal(int accBal) {
	this.accBal=accBal;
	return accBal;
}
public int getPin() {
	return pin;
}
public void setPin(int Pin) {
	this.Pin= Pin;
}
@Override
public String toString() {
	return "Bank [accountNo=" + accountNo + ", accHolderName=" + accHolderName + ", accBal=" + accBal + ", pin=" + pin
			+ "]";
}
	
}

