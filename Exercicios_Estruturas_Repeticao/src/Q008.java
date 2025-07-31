/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

import java.util.Scanner;

public class Q008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, fatorial;
		
		N = sc.nextInt();
		fatorial = 1;

		if(N == 1 && N < 0) {
			System.out.println(fatorial);
		}else {
			for(int i = N; i != 0 ; i--) {
				fatorial = fatorial * i;
			}
			System.out.println(fatorial);
		}
		
		sc.close();
	}
}
