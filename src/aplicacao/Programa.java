package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Notas;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		Notas n1=new Notas();
		
		System.out.println("Nome do Aluno: ");
		n1.nome = sc.nextLine();
		
		System.out.println("Digite as  três notas do aluno: ");
		n1.nota1 = sc.nextDouble();
		n1.nota2 = sc.nextDouble();
		n1.nota3 = sc.nextDouble();
		n1.aprovacao();
	}
}