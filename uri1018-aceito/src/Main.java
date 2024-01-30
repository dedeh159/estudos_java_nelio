import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, cem, cinquenta, vinte, dez, cinco, dois, um;
		N = sc.nextInt();
		System.out.println(N);
		cem = N / 100;
		N = N % 100;
		System.out.println(cem + " nota(s) de R$ 100,00");
		cinquenta = N / 50;
		N = N % 50;
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		vinte = N / 20;
		N = N % 20;
		System.out.println(vinte + " nota(s) de R$ 20,00");
		dez = N / 10;
		N = N % 10;
		System.out.println(dez + " nota(s) de R$ 10,00");
		cinco = N / 5;
		N = N % 5;
		System.out.println(cinco + " nota(s) de R$ 5,00");
		dois = N / 2;
		N = N % 2;
		System.out.println(dois + " nota(s) de R$ 2,00");
		
		System.out.println(N + " nota(s) de R$ 1,00");
		
		
		
		
		sc.close();

	}

}
