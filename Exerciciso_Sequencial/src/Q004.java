/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Locale;
import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int idFuncionario, horasTrabalho;
		double salarioHora, salarioTotal;

		Scanner sc = new Scanner(System.in);

		idFuncionario = sc.nextInt();

		horasTrabalho = sc.nextInt();

		salarioHora = sc.nextDouble();

		System.out.println("NUMBER = " + idFuncionario);

		salarioTotal = salarioHora * horasTrabalho;

		// Printf é usado quando se quer formatar a saida
		System.out.printf("SALARY = %.2f%n", salarioTotal);

		sc.close();

	}

}
