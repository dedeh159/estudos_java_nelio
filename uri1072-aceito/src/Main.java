import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		int X;
		for (int i = 1; i <= N; i++) {
			X = sc.nextInt();
			if (X <= 20 && X >=10) {
				in +=1;
				
			}
			else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();

	}

}
