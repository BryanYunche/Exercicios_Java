/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação*/

import java.util.Locale;
import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0) {
			// Pode ser o quadrante 01 ou 04
			if (y > 0) {
				// Se X > 0 e Y > 0 é o quadrante 01
				System.out.println("Q1");
			} else {
				if (y < 0) {
					// Se X > 0 e Y < 0 é o quadrante 04
					System.out.println("Q4");
				}
			}
		} else {
			// Pode ser o quadrante 02 ou 03
			if (y > 0) {
				// Se X < 0 e Y > 0 é o quadrante 02
				System.out.println("Q2");
			} else {
				if (y < 0) {
					// Se X < 0 e Y < 0 é o quadrante 03
					System.out.println("Q3");
				}
			}
		}

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
	}
}
