import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, media;
		int N = sc.nextInt();
		
		for (int i = 1; i<=N; i++) {
			media = 0;
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			media = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);
			System.out.printf("%.1f%n", media);
		}
		
		
		
		sc.close();

	}

}
