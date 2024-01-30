import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double area, n;
		n = 3.14159;
		
		area = n * Math.pow(raio, 2.0);
		
		
		System.out.printf("%.4f%n", area);
		
		sc.close();
	}

}
