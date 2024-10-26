
public class Bank {
	static int c;
	
	private int accNo;
	private String name;
	private int balance;
	private String email;
	
	public Bank() {
		c++;
		this.accNo = c;
	}
	
	public Bank( String name, int balance, String email) {
		c++;
		this.accNo = c;
		this.name = name;
		this.balance = balance;
		this.email = email;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int bal) {
		this.balance = bal;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
    public String toString() {
        return "Bank [name=" + name + ", accNo=" + accNo + ", email=" + email + ", balance=" + balance + "]";
    }
}
