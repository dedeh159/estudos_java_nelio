import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, n4, n5, n6, media;
		int val = 0;
		media = 0;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		n5 = sc.nextDouble();
		n6 = sc.nextDouble();
		sc.close();
		if (n1 > 0) {
			val += 1;
			media += n1;
		}
		if (n2 > 0) {
			val += 1;
			media += n2;
		}
		if (n3 > 0) {
			val += 1;
			media += n3;
		}
		if (n4 > 0) {
			val += 1;
			media += n4;
		}
		if (n5 > 0) {
			val += 1;
			media += n5;
		}
		if (n6 > 0) {
			val += 1;
			media += n6;
		}
		media = (double)media / val;
		System.out.println( val + " valores positivos");
		System.out.printf("%.1f%n", media);
		
	}

}
