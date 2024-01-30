import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int total = N;
		
		
		for (int x = N - 1; x >= 1; x--) {
			
			total = total * x;
		}

		
		
		System.out.println(total);
		
		
		
		sc.close();

	}

}
