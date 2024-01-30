import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		double media, nota, mediaTotal;
		media = 0.0;

		while (cont < 2) {
			nota = sc.nextDouble();
			if (nota < 0 || nota > 10.0) {
				System.out.println("nota invalida");

			} else {
				media += nota;
				cont += 1;

			}

		}
		mediaTotal = media / cont;

		System.out.printf("media = %.2f%n", mediaTotal);

		sc.close();
	}

}
