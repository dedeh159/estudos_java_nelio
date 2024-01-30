import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		double med1 = n1 * 35;
		double med2 = n2  * 75;
		media = (med1 + med2) / 110;
		System.out.printf("MEDIA = %.5f%n", media);
		sc.close();
	}

}
