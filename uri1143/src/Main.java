import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a, b, c;


		System.out.println("1 1 1");
		for (int i = 2; i <= N; i++) {
			a = i;
			b = (int) Math.pow(i, 2.0);
			c = (int) a * b;

			System.out.println(a + " " + b + " " + c);

		}

		sc.close();
	}

}
