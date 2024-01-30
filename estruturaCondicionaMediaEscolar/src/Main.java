import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		media = n1 + n2;
		
		System.out.printf("NOTA FINAL = %.1f%n", media);
		
		if(media > 70.0) {
			System.out.println("ALUNO APROVADO");
		}
		else {
			System.out.println("ALUNO REPROVADO");
		}
		
		
		
		
		sc.close();
		

	}

}
