import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int coelhos = 0;
		int sapos = 0;
		int ratos = 0;
		int total = 0;
		char animal = 'S';
		double percRatos, percSapos, percCoelhos;
		for (int i = 1; i <= N; i++) {
			int quant = sc.nextInt();
			animal = sc.next().charAt(0);
			total += quant;

			if (animal == 'C') {
				coelhos += quant;

			}
			if (animal == 'S') {
				sapos += quant;
			}
			if (animal == 'R') {
				ratos += quant;
			}
		}
		percRatos = (double) ratos / total * 100.0;
		percSapos = (double) sapos / total * 100.0;
		percCoelhos = (double) coelhos / total * 100.0;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%%n", percCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%%n", percRatos);
		System.out.printf("Percentual de sapos: %.2f %%%n", percSapos);
		
		sc.close();
	}

}
