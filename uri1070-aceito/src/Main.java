import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			x += 1;
		}
		//else if (x % 2 != 0) {
		//	x += 2;
		//}
		
		System.out.println(x);
		x += 2;
		System.out.println(x);		
		x += 2;
		System.out.println(x);
		x += 2;
		System.out.println(x);
		x += 2;
		System.out.println(x);
		x += 2;
		System.out.println(x);
		x += 2;
		
		
		sc.close();

	}

}
