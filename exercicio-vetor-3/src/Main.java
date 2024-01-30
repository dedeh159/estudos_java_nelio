import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idades = new int[N];
		double[] alturas = new double[N];
		int menores = 0;
		double total = 0;
		
		for (int i = 0; i < N; i++) {
			
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		    alturas[i] = sc.nextDouble();
			
		}
		for (int i = 0; i<N; i++) {
			if (idades[i] < 18) {
				menores += 1;				
			}
			
			
			total += alturas[i];			
		}
		total /= N;
		System.out.printf("%.2f%n", total);
		
		
		System.out.println("menores de idade " + menores);
		
		
		sc.close();

	}

}
