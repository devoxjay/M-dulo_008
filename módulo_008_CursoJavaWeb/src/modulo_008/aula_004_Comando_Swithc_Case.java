package modulo_008;

import java.util.Scanner;

public class aula_004_Comando_Swithc_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número do mês para descrobrir a estação do ano:");

		int mes = sc.nextInt();
	
		switch (mes) {
		
		case 1:
		case 2:
		case 12:
			System.out.println("Verão");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("Outono");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("Inverno");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("Primavera");
			break;

		default:
			System.out.println("Opção inválida! Digite um número de 1 á 12");
			break;

		}
		sc.close();
	}

}
