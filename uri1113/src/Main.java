import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X, Y;
		X = 1;
		Y = 2;
		

		
		while (X != Y) {
			X = sc.nextInt();
			Y = sc.nextInt();
			
			if (X < Y) {
				System.out.println("Crescente");
			}
			else if(X > Y){
				System.out.println("Decrescente");
			}
		}
		
		sc.close();
	}

}
