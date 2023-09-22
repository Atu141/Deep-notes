package metodo;

import java.util.Scanner;

public class ex7 {

	static Scanner entrada = new Scanner(System.in);
	// metodos
	static int dia, valor;

	public static void print() {
		System.out.println("digite o numero de dias");
		dia = entrada.nextInt();

	}

	public static void zera() {
		dia = 0;
		valor = 0;
	}

	public static void conta() {
		char forma='z';
		System.out.println("");
		System.out.println("-----Forma-de-pagamento----------");
		System.out.println("");
		System.out.println("P  - (A prazo) ("+(dia * valor)+")" );
		System.out.println("V  - (A vista) ("+((dia * valor)-((dia * valor)*10/100))+")");
		System.out.println("");
		System.out.println("--------------------------");
		forma = Character.toUpperCase(entrada.next().charAt(0));
		
		if (forma == 'P') {
			System.out.println("total");
			System.out.println("O valor a prazo e  " + (dia * valor));
		} else if(forma == 'V'){
			System.out.println("total");
			System.out.println("O valor a Vista e  " + ((dia * valor)-((dia * valor)*10/100)));
			
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int sair = 0, quarto = 0;

		while (sair == 0) {
			System.out.println("");
			System.out.println("------------Hotel---------------");
			System.out.println("");
			System.out.println("1-(standart)");
			System.out.println("2-(Luxo)");
			System.out.println("3-(Super Luxo)");
			System.out.println("5- sair");
			System.out.println("");
			System.out.println("--------------------------");
			quarto = entrada.nextInt();

			if (quarto == 5) {
				sair++;
			} else {
				print();

				if (quarto == 1) {
					valor=380;
				} else {
					if (quarto == 2) {
						valor=450;
					} else {
						if (quarto == 3) {
							valor=560;
						}
					}
				}
				conta();
			}
			quarto = 0;
			zera();
		}

	}

}
