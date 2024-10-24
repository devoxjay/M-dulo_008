package modulo_008;

public class aula_002_Operador_Ternario_Simples {

	public static void main(String[] args) {
		
		//*Operadores ternários são micro validações*

		int nota1 = 20;
		int nota2 = 30;
		int nota3 = 70;
		int nota4 = 60;

		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		String saidaResultado = media > +70 ? "Aluno Aprovado"
				: (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Aluno reprovado";

		System.out.println("Sua média é: " + media);
		System.out.println(saidaResultado);

	}

}
