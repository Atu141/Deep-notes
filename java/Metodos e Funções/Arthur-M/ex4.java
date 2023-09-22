package metodo;

import java.util.Scanner;

public class ex4 {

	static Scanner entrada = new Scanner(System.in);
	// metodos
	static int num1, num2;
	
	public static void print() {
		System.out.println("digite o primeiro numero ");
		num1 = entrada.nextInt();
		System.out.println("digite o segundo numero ");
		num2 = entrada.nextInt();
	}
	public static void zera() {
		num1 = 0;
		num2 = 0;
	}
	public static void adi() {
		System.out.println("O resultado e " + (num1 + num2));
	}
	public static void sub() {
		System.out.println("O resultado e " + (num1 - num2));
	}
	public static void multi() {
		System.out.println("O resultado e " + (num1 * num2));
	}
	public static void divi() {
		System.out.println("O resultado e " + (num1 / num2));
	}

	// main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sair = 0, operacao = 0;

		while (sair == 0) {
			System.out.println("");
			System.out.println("------------Calculadora---------------");
			System.out.println("");
			System.out.println("1-adiçao");
			System.out.println("2-subtraçao");
			System.out.println("3-multiplicaçao");
			System.out.println("4-divisao");
			System.out.println("5-sair");
			System.out.println("");
			System.out.println("--------------------------");
			operacao = entrada.nextInt();

			if (operacao == 5) {
				sair++;
			} else {
				print();

				if (operacao == 1) {
					adi();
				}
				if (operacao == 2) {
					sub();
				}
				if (operacao == 3) {
					multi();
				}
				if (operacao == 4) {
					divi();
				}
				if (operacao == 5) {
					sair++;
				}
				operacao = 0;
				zera();
			}
		}

	}// main

}
