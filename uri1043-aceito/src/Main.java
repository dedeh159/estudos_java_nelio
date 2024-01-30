import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		Locale.setDefault(new Locale("en", "US"));

		float a, b, c, perimetro, area;

		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		perimetro = a + b + c;
		area = (c * (a + b)) / 2;

		if (((b + c) > a) && ((a + b) > c) && ((a + c) > b)) {
			System.out.printf("Perimetro = %.1f\n", perimetro);
		} else {
			System.out.printf("Area = %.1f\n", area);
		}
		sc.close();
	}
}