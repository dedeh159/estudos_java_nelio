import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, horas, minutos, segundos, resto;
		N = sc.nextInt();
		
		horas = N / 3600;
		N = N % 3600;
		minutos = N / 60;
		N = N % 60;
		segundos = N;
		
		System.out.printf("%d:%d:%d%n",horas, minutos, segundos);
		
		
		
		
		sc.close();

	}

}
