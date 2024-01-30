package uri1040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float n1, n2, n3, n4, media, notaExame, mediaFinal;
		media = 0;

		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();

		n1 = n1 * 2;
		n2 = n2 * 3;
		n3 = n3 * 4;

		media = (n1 + n2 + n3 + n4) / 10f;

		System.out.printf("Media: %.1f%n", media);
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		} else if (media >= 5.0 && media < 7.0) {
			System.out.println("Aluno em exame.");
			float exame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", exame);
			mediaFinal = (media + exame) / 2;
			if ((media + exame / 2) >= 5) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
			} else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
			}
		}

		sc.close();
	}

}
