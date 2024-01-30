import java.util.Locale; // <------serve para importar a localização desejada
//pra trocar por virgula

public class Main {

	public static void main(String[] args) {
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US); //<-- chama o locale para exibir ponto ao invés de virgula.
		System.out.printf("%.2f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);//chamando o comando printf para exibir texto
		//com variável de duas casas decimais.
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		
	}

}
