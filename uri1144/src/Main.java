import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 1;
		int N = sc.nextInt();
		N *= 2;
		int a, b, c;
		a = 1;
		b = 1;
		c = 1;

		System.out.println(a + " " + b + " " + c);
		b = 2;
		c = 2;
		System.out.println(a + " " + b + " " + c);
		a = 2;
		
		for (int i = 3; i <= N; i++) {
			if (cont >= 2) {
			b = a * 2;
			if (b % 2 != 0) {
				b = b * a;
				
				c = b * a - 1;
				System.out.println(a + " " + b + " " + c);
			}
			else { 
				c = b * a;
			}
			cont ++;
			System.out.println(a + " " + b + " " + c);
			}
			a ++;

			sc.close();
		}
	}
}
