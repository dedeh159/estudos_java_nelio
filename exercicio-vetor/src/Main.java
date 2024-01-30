import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double soma = 0;	
		
		int N = sc.nextInt();
		double vet[] = new double[N];
		
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();			
		}
		for (int i = 0; i<N; i++) {
			System.out.print(vet[i] + " ");
			System.out.println();

			soma += vet[i];		
		}
		double media = soma / N;
		System.out.printf("%.2f%n", soma);
		
		System.out.printf("%.2f%n", media);
		
		
		
		sc.close();

	}

}
