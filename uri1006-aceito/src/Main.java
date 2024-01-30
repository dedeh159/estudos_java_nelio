import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		n1 = n1 * 20;
		n2 = n2 * 30;
		n3 = n3 * 50;
		
		double media = (n1 + n2 + n3) / 100;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		
		sc.close();

	}

}
