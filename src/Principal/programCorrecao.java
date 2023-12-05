package Principal;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrecao;

public class programCorrecao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrecao contaCorrecao;

		System.out.print("Enter account number");
		int number = sc.nextInt();

		System.out.println("Enter account holder");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (Y/N) ? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			contaCorrecao = new ContaCorrecao(number, holder, initialDeposit);
		} else {
			contaCorrecao = new ContaCorrecao(number, holder);
		}

		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(contaCorrecao);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		contaCorrecao.deposit(depositValue);
		System.out.println("update account data: ");
		System.out.println(contaCorrecao);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double withDrawValue = sc.nextDouble();
		contaCorrecao.withdraw(withDrawValue);
		System.out.println("update account data: ");
		System.out.println(contaCorrecao);

		sc.close();

	}

}
