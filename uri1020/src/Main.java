import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, anos, meses;
		
		N = sc.nextInt();
		anos = N / 365;
		N = N % 365;
		System.out.println(anos + " ano(s)");
		meses = N / 30;
		N = N % 30;
		System.out.println(meses + " mes(es)");
		System.out.println(N + " dia(s)");
		
		
		sc.close();

	}

}
