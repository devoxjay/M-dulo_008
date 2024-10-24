package modulo_008;

public class aula_001_if_Else {

	public static void main(String[] args) {
		
		int mediaAluno = 70;
		String nome = "Jairo";

		if (mediaAluno >= 70 && nome.equals("Jairo")) {
			System.out.println("Parabens, você foi aprovado!");
		} else if (mediaAluno < 70){
			System.out.println("Infelismente não foi dessa vez!");
		}
		else {
			System.out.println("Aluno não encontrado");
		}
		

	}

}
