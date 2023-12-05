package Principal;

import java.util.Scanner;
import entities.Conta;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double depositoInicial = 0;
		int numeroConta = 0;
		double deposito = 0;
		double saque = 0;

		System.out.println("Digite o nome de usuario: ");
		String nomeUsuario = sc.nextLine();
		System.out.println("Deseja realizar um deposito inicial? Digite 1 para sim ou 2 para não");
		int res1 = sc.nextInt();

		if (res1 == 1) {
			System.out.println("Qual valor deseja depositar?");
			depositoInicial = sc.nextDouble();
		} else {
			System.out.println("Ok, seguiremos sem deposito!");
		}

		System.out.println("Digite o numero da conta: ");
		numeroConta = sc.nextInt();
		
		System.out.println("CONTA CRIADA COM SUCESSO!");
		System.out.println("");
		
		System.out.println("Deseja realizar outra operaçãp ? 1- DEPOSITO 2- SAQUE 3- NÃO");
		int res2 = sc.nextInt();
		
		if (res2 == 1) {
			System.out.println("Qual valor deseja depositar ? ");
			deposito = sc.nextDouble();
			
			System.out.println("Valor depositado com sucesso! ");
			System.out.println("");
		} else if(res2 == 2){
			System.out.println("Qual o valor do saque ? ");
			saque = sc.nextDouble();
		} else {
			System.out.println("Obrigado por utilizar nossos serviços!");
			System.out.println("");
		}
		
		

		Conta conta = new Conta(numeroConta, nomeUsuario, depositoInicial, deposito,saque);

		conta.statusConta();
		System.out.println("");
		

		sc.close();
	}

}
