
/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/
import java.util.Scanner;

public class Q002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor, marcador;

		valor = sc.nextInt();

		marcador = valor % 2;

		if (marcador == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
	}
}
