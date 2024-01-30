import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		double gas = sc.nextDouble();
		
		double distL = (double) km / gas;
		
		System.out.printf("%.3f km/l%n", distL);

	}

}
