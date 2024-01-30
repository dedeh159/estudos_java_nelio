import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media, soma;
		soma = 0;
		double N = sc.nextDouble();
		int total = 0;
		
		if (N < 0.0) {
			System.out.println("Impossivel calcular");
		}
		else {
			while (N > 0) {
				soma += N;
				N = sc.nextDouble();
				total += 1;
				}
		}
		media = (double) soma / total;
		System.out.printf("%.2f%n",media);
		
		
		
		
		sc.close();
	}

}
