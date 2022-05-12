package LacosRepeticaoForWhile;

import java.util.Scanner;

//* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)//*


public class Exercicio2for {

	public static void main(String[] args) {
		int numero, somaP = 0, somaI = 0;
		Scanner ler = new Scanner (System.in);
		
		for (int cont = 0; cont < 10; cont++) {
			System.out.printf("Digite o " + (cont+1) + "º número: ");
			numero = ler.nextInt();
		
			if (numero % 2 == 0) {
				somaP++;
			} else {
				somaI++;
			}
		}
		System.out.println("\nTotal de números pares: " + somaP + "\n"
				+ "Total de números ímpares: " + somaI);
		ler.close();
	}
}
