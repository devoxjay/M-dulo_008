package exercícios;

import java.util.Locale;
import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor que deseja converter em reais: ");
		double valor = sc.nextDouble();
		
		System.out.println("Digite a moeda que deseja converter: ");
		String moeda = sc.next();

		switch (moeda) {

		case "dolar":
			System.out.println("O valor da conversão é:USD " + valor * 5.6963);
			break;
		case "euro":
			System.out.println("O valor da conversão é:EUR " + valor * 6.1583);
			break;

		default:
			System.out.println("Moeda não encontrada");
		}
		sc.close();

	}

}
