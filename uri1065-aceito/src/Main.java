import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, n4, n5, intVal;
		double teste = 2;
		intVal = 0;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
				
		
		
		if (n1 % teste == 0) {
			intVal += 1;
		}
		if (n2 % teste == 0) {
			intVal += 1;
		}
		if (n3 % teste == 0) {
			intVal += 1;
		}
		if (n4 % teste == 0) {
			intVal += 1;
		}
		if (n5 % teste == 0) {
			intVal += 1;
		}
		System.out.println(intVal + " valores pares");
		
		
		
		
		sc.close();

	}

}
