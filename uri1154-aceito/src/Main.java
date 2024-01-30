import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, contador, soma;
		double media;
		
		contador = 0;
		soma = 0;
		idade = sc.nextInt();
		
		while (idade >= 0) {
			soma += idade;
			contador += 1;
			idade = sc.nextInt();

		}
		
		media = (double) soma / contador;
		System.out.printf("%.2f%n", media);
		
		
		
		sc.close();

	}

}
