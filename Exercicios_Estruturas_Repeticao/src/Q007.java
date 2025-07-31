/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"*/

import java.util.Locale;
import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double divisao, numerador, denominador;
		
		N = sc.nextInt();
		
		for (int i = 0; i< N; i++) {
			numerador = sc.nextInt();
			denominador = sc.nextInt();
			
			if(denominador == 0) {
				System.out.println("Divisão impossivel");
			}else {
				divisao = numerador/denominador;
				System.out.printf("%.1f", divisao);
			}
		}
		
		sc.close();
	}
}