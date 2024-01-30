import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int gremio, inter, sN, gremioCont, interCont, emp, cont;
		sN = 1;
		gremioCont = 0;
		interCont = 0;
		emp = 0;
		cont = 0;

		while (sN == 1) {

			inter = sc.nextInt();
			gremio = sc.nextInt();
			cont +=1;
			
			if (inter > gremio) {
				interCont += 1;
			}
			if (gremio > inter) {
				gremioCont += 1;
			} else if ( gremio == inter){
				emp += 1;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			sN = sc.nextInt();
			if (sN == 2) {
				System.out.println(cont + " grenais");
				System.out.printf("Inter:%d%n", interCont);
				System.out.printf("Gremio:%d%n", gremioCont);
				System.out.printf("empates:%d%n", emp);
				if (interCont == gremioCont) {
					System.out.println("Nao houve vencedor");
				}
				else if(interCont > gremioCont) {
					System.out.println("Inter venceu mais");
				}
				else if(interCont < gremioCont) {
					System.out.println("Gremio venceu mais");
					
				}
			}
		}

		sc.close();
		System.out.println();

	}

}
