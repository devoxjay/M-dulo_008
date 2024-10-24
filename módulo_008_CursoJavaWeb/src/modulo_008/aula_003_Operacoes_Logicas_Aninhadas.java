package modulo_008;

public class aula_003_Operacoes_Logicas_Aninhadas {

	public static void main(String[] args) {

		int nota1 = 100;
		int nota2 = 90;
		int nota3 = 100;
		int nota4 = 90;

		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* São operações dentro de operações */

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno aprovado direto. Parabéns!"+ media);
				}else {
					System.out.println("Aluno está aprovado direto:"+ media);
				}
			}else {
			System.out.println("Aluno está em recuperação:"+ media);
		}
		}else {
			System.out.println("Aluno reprovado:"+ media);
		}
		
	}

}
