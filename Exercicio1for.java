package LacosRepeticaoForWhile;

//* Informar todos os números de 1000 a 1999 que quando divididos por 11
// obtemos resto = 5. (FOR) //*




public class Exercicio1for {
	public static void main(String[] args) {
		for (int cont = 1000; cont < 2000; cont++) {
			if (cont % 11 == 5) {
				System.out.println(cont);
			}
		}
	}
}