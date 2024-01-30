import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double trigRet = (A * C) / 2.0;
		System.out.printf("TRIANGULO: %.3f%n", trigRet);
		
		double areaCirculo = Math.pow(C, 2);
		areaCirculo = areaCirculo * pi; 
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		
		double trapezio = (A + B) * C / 2;
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		
		double quadrado = B * B;
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		
		double retangulo = A * B;
		
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		sc.close();
	}

}
