import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cont = 1;
		for (int i = 1; i<= N; i++) {
			System.out.print(cont + " ");
			cont ++;
			System.out.print(cont + " ");
			cont ++;
			System.out.print(cont + " ");
			cont ++;
			System.out.println("PUM");
			cont ++;
		}
		
		sc.close();

	}

}
