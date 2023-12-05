package entities;

public class ContaCorrecao {

	private int number;
	private String holder;
	private double balance;

	public ContaCorrecao(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public ContaCorrecao(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amout) {
		balance += amout;
	}

	public void withdraw(double amout) {
		balance -= amout + 5;
	}

public String toString() {
	return "contaCorrecao"
			+ number
	        + ",holder: "
	        + holder
	        + ", Balance"
	        + String.format("%.2f", balance);
}

}
