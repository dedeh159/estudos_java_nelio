package uri1074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int number;
		for (int i = 1; i <= N; i++) {
			number = sc.nextInt();
			
			
			if (number == 0) {
			System.out.println("NULL");
			}
			if (number % 2 == 0 && number != 0) {
				System.out.print("EVEN ");
			}
			if (number % 2 != 0 && number != 0) {
				System.out.print("ODD ");
			}
			if (number > 0 ) {
				System.out.println("POSITIVE");
			}
			if (number < 0) {
				System.out.println("NEGATIVE");
			}
			
			
			
			
		}
		
		
		
		sc.close();

	}

}
