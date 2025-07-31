/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Locale;
import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cdg01, cdg02, nP01, nP02;
		double valor01, valor02, valorTotal;

		cdg01 = sc.nextInt();
		nP01 = sc.nextInt();
		valor01 = sc.nextDouble();

		cdg02 = sc.nextInt();
		nP02 = sc.nextInt();
		valor02 = sc.nextDouble();

		valorTotal = ((nP01 * valor01) + (nP02 * valor02));

		System.out.println("VALOR A PAGAR: R$ " + valorTotal);

		sc.close();
	}
}
