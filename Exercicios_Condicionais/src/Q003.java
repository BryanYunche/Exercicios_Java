
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/
import java.util.Scanner;

public class Q003 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;
		double marcador01, marcador02;

		A = sc.nextInt();
		B = sc.nextInt();

		marcador01 = A % B;
		marcador02 = B % A;

		if (marcador01 == 0 || marcador02 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
