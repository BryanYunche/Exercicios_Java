
//Faça um programa para ler dois valores inteiros, 
//e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Q001 {
	public static void main(String[] args) {
		int num01, num02, soma;
		Scanner sc = new Scanner(System.in);

		num01 = sc.nextInt();
		num02 = sc.nextInt();
		soma = num01 + num02;

		System.out.println("SOMA = " + soma);

		sc.close();

	}

}
