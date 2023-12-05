package entities;

public class Conta {
	private double numeroConta;
	public String nomeUsuario;
	public double depositoInicial;
	private double saldoConta;
	public double deposito;
	public double saque;

	public Conta(int numeroConta, String nomeUsuario, double depositoInicial, double deposito,double saque) {
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
		this.depositoInicial = depositoInicial;
		this.deposito = deposito;
	}

	public double getSaque() {
		return saldoConta - saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaldoConta() {
		return depositoInicial + saldoConta + deposito - saque;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(double numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(int depositoInicial) {
		this.depositoInicial = depositoInicial;
	}

	public void statusConta() {
		System.out.println("INFORMAÇÕES DA CONTA:");
		System.out.println("Numero da conta: " + getNumeroConta());
		System.out.println("Nome do titular: " + getNomeUsuario());
		System.out.println("Saldo atual da conta: " + getSaldoConta());

	}

}
