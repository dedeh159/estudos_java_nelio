import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int vel = sc.nextInt();
		double dist = vel * tempo;
		
		double gas = dist / 12;
		
		System.out.printf("%.3f%n", gas);
		
		sc.close();

	}

}
