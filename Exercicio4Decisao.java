package Introducao;

//*    Faça um programa em que permita a entrada de um número qualquer e exiba se este
		// número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		//		ímpar exiba o número elevado ao quadrado. *//


import java.util.Scanner;

public class Exercicio4Decisao {
	public static void main (String args[]) {
		
		int number;
		Scanner read = new Scanner (System.in);
		
		System.out.printf("Olá! Digite qualquer número: ");
		number = read.nextInt();
		
		if (number % 2== 0) {
			System.out.println("\nO número" + number + "é par.\n"
					+ "Elevando ao quadrado, o cálculo fica: " + Math.pow(number, 2));
			
		} 
		else
		{ System.out.println("\nO número " + number + "é ímpar.");	
			
			
		}
		
		
		read.close();
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	