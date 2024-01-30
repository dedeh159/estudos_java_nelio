import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dist = sc.nextInt();
		
		int tempo = dist * 2;
		System.out.printf("%d minutos%n", tempo);
		
		sc.close();

	}

}
