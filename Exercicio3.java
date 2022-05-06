package Introducao;

import java.util.Scanner;

public class Exercicio3 {
//* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//	categoria ela se encontra:
//		 10-14 infantil
//		 15-17 juvenil     ctrl shift O  (importou biblio scanner)
//		 18-25 adulto *//
		
	public static void main(String[] args) {
		int idade;
		System.out.println("Olá! Tudo bem? \nPara saber se sua categoria é infantil, juvenil ou adulto, digite sua idade aqui:");
		
		Scanner readme = new Scanner(System.in); 
		
		idade = readme.nextInt();
		
		if (idade>=10 && idade<=14)
		System.out.println("10-14 anos: Infantil");
		
		else if (idade>=15 && idade<=17)
		System.out.println("15-17: Juvenil");
		
		else if (idade>=18 &&idade<=25)
			System.out.println("18-25: Adulto");
		
		else
		System.out.println("Se for maior que 25, infelizmente não temos espaço para você no time.");
		

	}

}
