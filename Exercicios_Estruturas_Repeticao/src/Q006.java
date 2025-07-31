/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

import java.util.Locale;
import java.util.Scanner;

public class Q006 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, p1 = 2, p2 = 3, p3 = 5;
		double valor01, valor02, valor03, media;
		
		N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			valor01 = sc.nextDouble();
			valor02 = sc.nextDouble();
			valor03 = sc.nextDouble();
			
			media = (valor01*p1 + valor02*p2 + valor03*p3)/(p1+p2+p3);
			System.out.printf("%.1f", media);
		}
		
		sc.close();
	}

}
