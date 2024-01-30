import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int impares = 1;
		int x = sc.nextInt();

		while ( impares <= x) {
			System.out.println(impares);
			impares +=2;
		}
		
		sc.close();

	}

}
