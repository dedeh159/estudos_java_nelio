import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double reajuste;
		double salario =sc.nextDouble();
		
		if (salario <= 400.00) {
			reajuste = (salario / 100 * 15);
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n",salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");			
		}
		else if (salario <= 800.0) {
			reajuste = (salario / 100 * 12);
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n",salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
		}
		else if (salario <= 1200.0) {
			reajuste = (salario / 100 * 10);
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n",salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
		}
		else if (salario <= 2000.0) {
			reajuste = (salario / 100 * 7);
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n",salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		}
		else if (salario > 2000.0) {
			reajuste = (salario / 100 * 4);
			salario += reajuste;
			System.out.printf("Novo salario: %.2f%n",salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		}
		
		sc.close();
	}
}