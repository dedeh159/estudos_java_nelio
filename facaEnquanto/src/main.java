import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resposta;
		do {
		System.out.print("Digite a temperatura em celsius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		
		System.out.printf("Equivalente em Farenheit: %.1f%n", F);
		System.out.print("Deseja repetir? (S/N");
		resposta = sc.next().charAt(0);
		}
		while (resposta != 'n');
		
		
		sc.close();

	}

}
