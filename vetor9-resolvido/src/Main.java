import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nome = new String[N];
		double[] compra = new double[N];
		double[] venda = new double[N];
		double[] perc = new double[N];
		int a = 0;
		int b = 0;
		int c = 0;
		double totalCompra = 0;
		double totalVenda = 0;
		double lucro = 0;
		for (int i = 0; i < N; i++) {
			nome[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
			totalCompra += compra[i];
			totalVenda += venda[i];
			
			perc[i] = (venda[i] - compra[i]) * 100 / compra[i];	
			if (perc[i] < 10.0) {
				a++;				
			}
			else if (perc[i]>= 10 && perc[i] <= 20) {
				b ++;
			}
			else if(perc[i] > 20) {
				c ++;
			}				
		}
		lucro = totalVenda - totalCompra;
		System.out.println("Lucro abaixo de 10%: " + a);
		System.out.println("Lucro entre 10% e 20%: " + b);
		System.out.println("Lucro acima de 30%: " + c);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", lucro);
		
		
		
		
		sc.close();

	}

}
