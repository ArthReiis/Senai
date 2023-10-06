package atividade2;

import java.util.Scanner;

public class Maindois {

	public static void main(String[] args) {

		double media = 0;
		Scanner leia = new Scanner(System.in);
		Aluno med = new Aluno("Arthur", 20, media);
		
		System.out.println("Digite a primeira nota");
		double nota1 = leia.nextDouble();

		System.out.println("Digite a segunda nota");
		double nota2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota3 = leia.nextDouble();
		
		double resultado = Aluno.calcularMedia(nota1, nota2, nota3);
		System.out.println(resultado);
		
	double verif = med.verificarAprovacao(resultado);
		

	}

}
