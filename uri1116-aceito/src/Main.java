import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int N = sc.nextInt();
			
			double n1, n2, div;
			for (int i = 1; i<=N; i++) {
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				if (n2 == 0) {
					System.out.println("divisao impossivel");
				}
				else {
					div = n1 / n2;
					
					System.out.printf("%.1f%n",div);
				}
				
				
			}
		
		
		
		sc.close();

	}

}
