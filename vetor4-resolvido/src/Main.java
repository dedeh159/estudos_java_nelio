import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] reais = new double[N];
		double media = 0;
		
		
		for (int i=0; i<N; i++) {
			reais[i] = sc.nextDouble();
			media += reais[i];
		}
		media /= N;
		
		System.out.printf("%.3f%n", media);
		for (int i=0; i<N; i++) {
			if(reais[i]< media) {
				System.out.printf("%.1f%n", reais[i]);
			}
			
		}
		
		
		
		sc.close();

	}

}
