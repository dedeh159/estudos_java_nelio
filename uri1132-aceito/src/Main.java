import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int mult = 0;
		int X, Y;

		if (n1 < n2) {
			X = n1;
			Y = n2;
		} else {
			X = n2;
			Y = n1;
		}

		while (X <= Y && Y != 0) {
			if (X % 13 != 0) {
				mult += X;
				X += 1;
			} else {
				X += 1;
			}

		}
		System.out.println(mult);

		sc.close();

	}

}
