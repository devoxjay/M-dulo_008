package exercícios;

import java.util.Scanner;

public class wilhe_fixacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int numero;

		System.out.println("Digite um número para somar (0 para sair): ");
		numero = sc.nextInt();

		while (numero != 0) {
			soma += numero; // Adiciona o número à soma
			System.out.println("Digite um número para somar (0 para sair): ");
			numero = sc.nextInt();
		}

		System.out.println("Soma total: " + soma);
		sc.close();

	}

}
