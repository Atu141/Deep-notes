package aula_java;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int x = 111110;
		int cat = 0, milhas = 0, ctl = 0, ctl2 = 0, tamanho = 0;
		int[][] matrix = new int[4][5];
		System.out.println("Informe a quantidade de clientes");
		tamanho = entrada.nextInt();
		while (ctl < tamanho) {
			System.out.println("Informe os valores do " + ctl + " cliente");

			System.out.println("Informe quntas milhas vc tem");
			matrix[ctl][1] = entrada.nextInt();
			matrix[ctl][4] = matrix[ctl][1];
			while (ctl2 != 1) {
				System.out.println("Informe a categoria: 1-diamante 2-ouro 3-prata");
				matrix[ctl][2] = entrada.nextInt();
				if (matrix[ctl][2] == 1) {
					matrix[ctl][4] += 10000;
					matrix[ctl][3] = 10000;
					ctl2++;
				} else {
					if (matrix[ctl][2] == 2) {
						matrix[ctl][4] += 5000;
						matrix[ctl][3] = 5000;
						ctl2++;
					} else {
						if (matrix[ctl][2] == 3) {
							matrix[ctl][3] = 0;
							ctl2++;
						} else {
							System.out.println("por favor digite uma categoria valida");
						}
					}
				}

			}
			ctl++;
			ctl2 = 0;

		}
		ctl = 0;
		while (ctl < tamanho) {
			System.out.println(ctl + "cliente");
			System.out.println("cod " + matrix[ctl][0]);
			System.out.println("quant inicial" + matrix[ctl][1]);
			System.out.println("cate" + matrix[ctl][2]);
			System.out.println("bonus" + matrix[ctl][3]);
			System.out.println("valor final" + matrix[ctl][4]);
			ctl++;
		}

	}

}
