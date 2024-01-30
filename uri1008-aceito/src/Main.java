import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int funcN = sc.nextInt();
		int h = sc.nextInt();
		double val = sc.nextDouble();
		
		System.out.println("NUMBER = "+funcN);
		
		double salary = val*h;
		
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		
		
		sc.close();

	}

}
