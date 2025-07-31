/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor;

		valor = sc.nextInt();

		if (valor < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();

	}
}
