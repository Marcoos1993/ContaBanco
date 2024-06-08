package aplicacao;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor digite o numero da sua conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Digite o numero da agencia: ");
		String agencia = sc.next();
		
		sc.nextLine();
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();

		System.out.print("Saldo da conta: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Ola " + nome + ", Obrigado por criar uma conta em nosso banco, sua agencia e: " + agencia + ", conta " + 
		numero + " e seu saldo " + saldo + " ja esta disponivel.");

		
	}

}
 