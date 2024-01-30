import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] numeros = new int[N];
		int pares = 0;
		
		
		for(int i=0; i<N; i++) {
			numeros[i] = sc.nextInt();		
		}
		
		for (int i = 0; i<N; i++) {
			
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				pares += 1;				
			}			
		}
		System.out.println();
		System.out.println(pares);
		
		
		
		
		sc.close();
	}

}
