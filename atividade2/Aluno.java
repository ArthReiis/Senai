package atividade2;

public class Aluno {
	String nome;
	int idade;
	double media;
	
public Aluno(String nome, int idade, double media)	{
	
	this.nome = nome;
	this.idade = idade;
	this.media = media;
		
}
	public static double calcularMedia(double n1, double n2, double n3) {
		
		double media = (n1 + n2 + n3) / 3;
		
		return media;
		
	}
	
	public double verificarAprovacao(double media) {
		
		if (media >= 7) { 
			System.out.println("O aluno " + nome + " está aprovado!");			
		} 
		
		if (media >= 5 && media < 7 ) {
			System.out.println("O aluno " + nome + " está em exame!");			
		} 
		
		if (media < 5) {
			System.out.println("O aluno " + nome + " está reprovado!");
		}
		
		return media;
		
	}
	
}