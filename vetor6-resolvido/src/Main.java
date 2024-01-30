import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int velho = 0;
		int N = sc.nextInt();
		String[] nomes = new String[N];
		int[] idades = new int[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			if (velho < idades[i]) {
				velho = idades[i];
			}
		}
		for (int i = 0; i < N; i++) {
			if (idades[i]==velho) {
				System.out.println("Pessoa mais velha: " + nomes[i]);
			}

		}

		sc.close();

	}

}
