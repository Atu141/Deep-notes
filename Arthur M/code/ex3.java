package aula_java;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		int cat = 0, milhas = 0, linha = 0, coluna = 0, tamanho = 0;
		
		double[] custo = new double[5];
		String[] produtos = new String[] {"camisa","blusa","calça","vestido","meia"};
		
		double[][] imposto = new double[5][4];
		double[][] precos = new double[5][4];
		
		
		while (linha < 3) {
			System.out.println("Informe o preço do produto");
			
			while (coluna < 5) {
			
				coluna++;
				
			}
			coluna = 0;
			linha++;
		}
		
		
		
		
	}

}
