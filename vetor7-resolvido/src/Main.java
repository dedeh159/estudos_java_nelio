import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] alunos = new String[N];
		double[] n1 = new double[N];
		double[] n2 = new double[N];
		
		for (int i=0; i<N; i++) {
			alunos[i] = sc.next();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados:");
		
		for(int i=0; i<N; i++) {
			if ((n1[i]+n2[i]) / 2 >= 6) {
				System.out.println(alunos[i]);
			}
			
		}
		
		
		
		
		
		sc.close();
		

	}

}
