import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool, gasolina, diesel, fim, digitado;
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		fim = 4;
		digitado = 0;
		while (digitado != 4) {
			digitado = sc.nextInt();
			if (digitado == 1) {
				alcool += 1;				
			}
			else if (digitado == 2) {
				gasolina += 1;
			}
			else if (digitado == 3) {
				diesel += 1;				
			}

			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		
		
		sc.close();
	}
}
