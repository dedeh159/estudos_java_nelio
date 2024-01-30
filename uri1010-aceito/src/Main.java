import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pcA, pcB, codA, codB;
		double valA, valB;

		codA = sc.nextInt();
		pcA = sc.nextInt();
		valA = sc.nextDouble();

		codB = sc.nextInt();
		pcB = sc.nextInt();
		valB = sc.nextDouble();
		sc.close();

		double valPag = (pcA * valA) + (pcB * valB);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valPag);

	}

}
