import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		int cont = 0;
		
		int N = sc.nextInt();
		double[] numeros = new double[N];
		
		for (int i=0; i<N; i++) {
			numeros[i] = sc.nextDouble();
			if (numeros[i] % 2 ==0) {
				soma += numeros[i];
				cont ++;				
			}			
		}
		soma /= cont;
		System.out.println(soma);
		
		
		
		
		sc.close();

	}

}
