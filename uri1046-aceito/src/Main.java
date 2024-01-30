import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h1, h2, total;
		total = 0;

		h1 = sc.nextInt();
		h2 = sc.nextInt();
		if (h1 < h2) {
			total = h2 - h1;
			System.out.println("O JOGO DUROU " + total + " HORA(S)");
		} else if (h2 == h1) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else {
			total = 24 - h1 + h2;
			System.out.println("O JOGO DUROU " + total + " HORA(S)");
		}
		sc.close();

	}

}
