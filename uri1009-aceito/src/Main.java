import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double sal = sc.nextDouble();
		double vendas = sc.nextDouble();
		double comissao = (vendas / 100.0) * 15.0;
		vendas = sal + comissao;
		System.out.printf("TOTAL = R$ %.2f%n", vendas);
		
		sc.close();
	}

}
