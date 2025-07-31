/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, valor, dentro = 0, fora = 0;
		
		N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			
			valor = sc.nextInt();
			
			if(valor >= 10 && valor <= 20) {
				dentro += 1;
			}else {
				fora += 1;
			}
		}
		
		System.out.println(dentro + " in");
		System.out.println(fora + " out");
		
		sc.close();
	}
}
