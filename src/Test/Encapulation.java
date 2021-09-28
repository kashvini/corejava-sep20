package Test;

public class Encapsulation {
  public int getBalaance() {
		return balaance;
	}
	public void setBalaance(int balaance) {
		this.balaance = balaance;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
private int balaance;
  private int AccountNumber;
  private String AccountHolderName;
}

