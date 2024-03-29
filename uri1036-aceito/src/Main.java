import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double delta = B * B - 4.0 * A * C;
		
		if (A == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			double r1 = (-B + Math.sqrt(delta)) / (2.0 * A);
			double r2 = (-B - Math.sqrt(delta)) / (2.0 * A);
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();

	}

}
