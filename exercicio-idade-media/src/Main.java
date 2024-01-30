import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		System.out.printf("NOME = %s IDADE = %d%n", nome1, idade1);
		System.out.println("NOME = " + nome2 + " IDADE = " + idade2);
		
		double idademed = (idade1+ idade2) / 2.0;
		System.out.printf("IDADE MÉDIA = %.1f%n", idademed);
		
		
		
		sc.close();
	}

}
