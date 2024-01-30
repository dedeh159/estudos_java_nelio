import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int mult = 1;		
		for (int i = 1; i <= 10; i++) {

			int tabuada = N *i;
			System.out.println(mult + " x " + N + " = " + tabuada);

		}
		
		
		sc.close();

	}

}
