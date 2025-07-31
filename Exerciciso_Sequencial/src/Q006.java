/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Locale;
import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double A, B, C, aTriRet, aCir, aTra, aQua, aRet, pi = 3.14159;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		aTriRet = (A * C) / 2;
		aCir = pi * (Math.pow(C, 2));
		aTra = ((A + B) * C) / 2;
		aQua = Math.pow(B, 2);
		aRet = A * B;

		System.out.printf("TRIANGULO: %.4f%n", aTriRet);
		System.out.printf("CIRCULO: %.4f%n", aCir);
		System.out.printf("TRAPEZIO: %.4f%n", aTra);
		System.out.printf("QUADRADO: %.4f%n", aQua);
		System.out.printf("RETANGULO: %.4f%n", aRet);

		sc.close();

	}

}
