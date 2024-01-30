import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, max;
		max = 0;
		int cont = 0;
		int contMax = 0;
		for (int i = 1; i <= 100; i++) {
			N = sc.nextInt();
			cont ++;
			if (N > max) {
				max = N;
				contMax = cont;
				
			}
		}
		System.out.println(max);
		System.out.println(contMax);
		
		
		sc.close();

	}

}
