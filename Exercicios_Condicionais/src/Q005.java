/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
Codigo: 1, 2, 3, 4, 5; Item: Cachorro Quente, X-Salada, X-Bacon, Torrada Simples, Refrigerante; Preço: 4.00, 4.5, 5.0, 2.0, 1.5*/

import java.util.Scanner;

public class Q005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double valorTotal;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {

			valorTotal = 4.00 * quantidade;
			System.out.println("Total: R$ " + valorTotal);
		} else {
			if (codigo == 2) {
				valorTotal = 4.50 * quantidade;
				System.out.println("Total: R$ " + valorTotal);
			} else {
				if (codigo == 3) {
					valorTotal = 5.00 * quantidade;
					System.out.println("Total: R$ " + valorTotal);
				} else {
					if (codigo == 4) {
						valorTotal = 2.00 * quantidade;
						System.out.println("Total: R$ " + valorTotal);
					} else {
						if (codigo == 5) {
							valorTotal = 1.50 * quantidade;
							System.out.println("Total: R$ " + valorTotal);
						}
					}
				}
			}
		}
	}
}
