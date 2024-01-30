import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int quant = sc.nextInt();
		double val = 0;

		switch (n) {

		case 1:
			val = (double)quant * 4.0;
			break;
		case 2:
			val = (double)quant * 4.5;
			break;
		case 3:
			val = (double)quant * 5.0;
			break;
		case 4:
			val = (double)quant * 2.0;
			break;
		case 5:
			val = (double)quant * 1.5;
			break;
		}
		System.out.printf("Total: R$ %.2f%n", val);

		sc.close();

	}

}
