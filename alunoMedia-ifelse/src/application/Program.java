package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno student = new Aluno();
		
		student.nome = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		student.grade();
		student.verificarAprovacao(student.media);
		
		
		sc.close();
	}

}
