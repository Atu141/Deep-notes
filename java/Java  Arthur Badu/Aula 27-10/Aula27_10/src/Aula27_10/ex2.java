package Aula27_10;

import java.util.Scanner;

public class ex2 {
	static Scanner entrada = new Scanner(System.in);
	static int [] arrayQuant= new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] modelo = new String []{"Classic","Cobalt","Onix","Prisma","Cruze"};
		double[]preco=new double[]{33600,44900,37790,43150,55400};
		int [][] vendas = vendasTri(modelo);
		relatorio(modelo,preco,vendas);
	}
	
	public static int[][] vendasTri(String [] modelo ) {
		int [][] vendas = new int [4][5];
		int k=0;
		
		for(int i=0;i<4;i++) {
			System.out.println("Vendas do "+(k+1)+"° Tri");
			k++;
			for(int j=0;j<5;j++) {
				System.out.print("carro: "+modelo[j] +":");
				vendas[i][j]=entrada.nextInt();
				System.out.println("=========================");
			}
		}
		return vendas;
	}

	
	public static double[] quantidade(double [][] vendas, double[]preco) {
		double []vendastotal = new double[5];
		for(int i =0;i<4;i++) {
			for(int j=0;j<5;j++) {
				arrayQuant[j] += vendas[i][j];
			}
		}
		
		for(int i=0;i<5;i++) {
			vendastotal[i]=arrayQuant[i]*preco[i];
		}
		
		return vendastotal;
	}
	
	public static void relatorio(String [] modelo,double[]preco,int [][] vendas) {
		double totGeral=0;
		
		double[]totvendas=quantidade(vendas,preco);
		
		for(int i=0;i<5;i++) {
			System.out.println("Carro: "+modelo[i]+"\t Quantidade Geral: "+arrayQuant[i]+"\t Total: "+ totGeral );
		}
		System.out.println("Total de Vendas: "+totGeral);
	}
}
