import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double menorAltura = 10.0;
		double maiorAltura = 0.0;
		int N = sc.nextInt();
		double[] altura = new double[N];
		char[] sexo = new char[N];
		double alturaF = 0;
		double contF = 0;
		int contM = 0;
		
		
		for(int i=0; i<N; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
			if (menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
			if (maiorAltura < altura[i]) {
				maiorAltura = altura[i];
			}
			if (sexo[i] == 'F') {
				alturaF += altura[i];
				contF ++;				
			}
			if (sexo[i] == 'M') {
				contM ++;				
			}
			
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		alturaF /= contF;
		System.out.printf("Media das alturas das mulheres = %.2f%n", alturaF);
		System.out.println("Numero de homens = " + contM);
		
		
		
		
		sc.close();

	}

}
