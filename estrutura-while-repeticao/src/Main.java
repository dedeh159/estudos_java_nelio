import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total;
		int x = sc.nextInt();
		total = x;

		
		
		while (x != 0) {
			
			x = sc.nextInt();
			total += x;
		}
		System.out.println(total);
		sc.close();
	}

}
