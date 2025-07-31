/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

import java.util.Locale;
import java.util.Scanner;

public class Q006 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double valor;

		valor = sc.nextDouble();

		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalor [0, 25]");
		} else {
			if (valor > 25 && valor <= 50) {
				System.out.println("Intervalor (25, 50]");
			} else {
				if (valor > 50 && valor <= 75) {
					System.out.println("Intervalor (50, 75]");
				} else {
					if (valor > 75 && valor <= 100) {
						System.out.println("Intervalor (75, 100]");
					} else {
						System.out.println("Fora do intervalo");
					}
				}
			}
		}

	}
}
