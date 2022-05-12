package Introducao;

import java.util.Scanner;

//* Faça um programa que entre com três números e coloque em ordem crescente. *//


public class Exercicio2Decisao {
	public static void main (String args[]) {
		
		int n1, n2, n3, p=0, s=0, t=0;
		Scanner read = new Scanner (System.in);
		
		System.out.printf("Primeiro numero: ");
		n1 = read.nextInt();
		System.out.printf("Segundo numero: ");
		n2 = read.nextInt();
	    System.out.printf("Terceiro número: ");
	    n3 = read.nextInt();
		
	    if (n1 == n2 && n1 == n3) {
			p = n1;
			s = n2;
			t = n3;
			
		} else if (n1 == n2 && n1 != n3) {
			if (n1 < n3) {
				p = n1;
				s = n2;
				t = n3;
			} else {
				p = n3;
				s = n2;
				t = n1;
			}
		
		} else if (n1 == n3 && n1 != n2) {
			if (n1 < n2) {
				p = n1;
				s = n3;
				t = n2;	
			} else {
				p = n2;
				s = n1;
				t = n3;
			}
		
		} else if (n2 == n3 && n2 != n1) {
			if (n2 < n1) {
				p = n2;
				s = n3;
				t = n1;
			} else {
				p = n1;
				s = n2;
				t = n3;
			}
		
		} else {
			if (n1 < n2 && n1 < n3) {
				p = n1;
				if (n2 < n3) {
					s = n2;
					t = n3;
				} else {
					s = n3;
					t = n2;
				}
			
			} else if (n2 < n1 && n2 < n3) {
				p = n2;
				if (n1 < n3) {
					s = n1;
					t = n3;
				} else {
					s = n3;
					t = n1;
				}
			
			} else {
				p = n3;
				if (n1 < n2) {
					s = n1;
					t = n2;
				} else {
					s = n2;
					t = n1;
				}
			}
		
		}	

		System.out.println("\nNúmeros em ordem crescente: " + p + " " + s + " " + t);
		read.close();
	}
}