package metodo;

import java.util.Scanner;

public class met1 {
	static Scanner entrada = new Scanner(System.in);

	// metodos
	public static void adi() {
		int num1 = 0, num2 = 0;
		System.out.println("digite o primeiro numero ");
		num1 = entrada.nextInt();
		System.out.println("digite o segundo numero ");
		num2 = entrada.nextInt();
		System.out.println("O resultado e " + (num1 + num2));
	}

	public static void sub() {
		int num1 = 0, num2 = 0;
		System.out.println("digite o primeiro numero ");
		num1 = entrada.nextInt();
		System.out.println("digite o segundo numero ");
		num2 = entrada.nextInt();
		System.out.println("O resultado e " + (num1 - num2));
	}

	public static void multi() {
		int num1 = 0, num2 = 0;
		System.out.println("digite o primeiro numero ");
		num1 = entrada.nextInt();
		System.out.println("digite o segundo numero ");
		num2 = entrada.nextInt();
		System.out.println("O resultado e " + (num1 * num2));
	}

	public static void divi() {
		int num1 = 0, num2 = 0;
		System.out.println("digite o primeiro numero ");
		num1 = entrada.nextInt();
		System.out.println("digite o segundo numero ");
		num2 = entrada.nextInt();
		System.out.println("O resultado e " + (num1 / num2));
	}
	// main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sair = 0, operacao = 0;

		while (sair == 0) {
			System.out.println("Calculadora");
			System.out.println("1-adiçao");
			System.out.println("2-subtraçao");
			System.out.println("3-multiplicaçao");
			System.out.println("4-divisao");
			System.out.println("5-sair");
			operacao = entrada.nextInt();
			
			if (operacao == 5) {
				sair++;
			}else {
				
			}
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
			operacao=0;
			

		}

		// chamar funcao

	}// main

}
