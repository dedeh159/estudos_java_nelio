import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] reais = new double[N];
		double maior = 0.0;
		int pos = 0;


		for (int i = 0; i < N; i++) {
			reais[i] = sc.nextDouble();
			if (maior < reais[i]) {
				maior = reais[i];
				pos = i;
			}

		}
		System.out.printf("%.1f%n", maior);
		System.out.println(pos);

		sc.close();

	}

}
