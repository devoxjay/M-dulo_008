package exercícios;

import java.util.Scanner;

public class aula_0044_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x <= 10) {
			System.out.println("Teste " + x);
			x++;
			
				sc.close();
			}
		}
	}

