import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, n5, intVal, imparVal, pos, neg;
		double teste = 2;
		intVal = 0;
		imparVal = 0;
		pos = 0;
		neg = 0;

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

		if (n1 % teste != 0) {
			imparVal += 1;
		}
		if (n2 % teste != 0) {
			imparVal += 1;
		}
		if (n3 % teste != 0) {
			imparVal += 1;
		}
		if (n4 % teste != 0) {
			imparVal += 1;
		}
		if (n5 % teste != 0) {
			imparVal += 1;
		}

		if (n1 > 0) {
			pos += 1;
		}
		if (n2 > 0) {
			pos += 1;
		}
		if (n3 > 0) {
			pos += 1;
		}
		if (n4 > 0) {
			pos += 1;
		}
		if (n5 > 0) {
			pos += 1;
		}

		if (n1 < 0) {
			neg += 1;
		}
		if (n2 < 0) {
			neg += 1;
		}
		if (n3 < 0) {
			neg += 1;
		}
		if (n4 < 0) {
			neg += 1;
		}
		if (n5 < 0) {
			neg += 1;
		}

		System.out.println(intVal + " valor(es) par(es)");
		System.out.println(imparVal + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");

		sc.close();

	}

}
