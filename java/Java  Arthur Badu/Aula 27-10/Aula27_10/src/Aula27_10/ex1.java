package Aula27_10;

import java.util.Scanner;

public class ex1 {
	static Scanner entrada = new Scanner(System.in);
	
	static String[] linhas = new String[] {"Perfumaria","Maquiagem","Cabelo"};
	static int somaMatriz=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] regioes = new String[] {"Sul","Sudeste","Norte","Nordeste"};
		//A)
		int [][] vendas = carregarVendas(regioes);
		
		//B)	
		int [] somaLinha = somaLinhaProd(vendas);
		System.out.println("");
		System.out.println("Soma Linha de Produtos");
		for(int i=0;i<3;i++) {
			System.out.println(linhas[i]+":"+somaLinha[i]);
		}
		
		//C)
		ranking(somaLinha);
		
		//D
		 maiorVenda(regioes, vendas);
	}
	//A)
	public static int [][] carregarVendas(String[] regioes){
		int [][] vendas = new int [4][3];
		for(int r=0;r<4;r++) {
			for(int l=0;l<3;l++) {
				System.out.println(regioes[r]+"-"+linhas[l]+":");
				vendas[r][l]=entrada.nextInt();
				somaMatriz+=vendas[r][l];
			}
		}
		return vendas;
	}

	//B)
	public static int[] somaLinhaProd(int[][] vendas) {
		
		int [] somaLinha = new int[3];
		for(int l=0;l<3;l++) {
			for(int r=0;r<4;r++) {
				somaLinha[l]+=vendas[r][l];
			}
		}
		
		
		return somaLinha;
		
	}
	
	//C)
	public static void ranking(int [] somaLinha) {
		
		int auxValor =0;
		String auxLinha; 
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				if(somaLinha[j]<somaLinha[j+1])  {
					auxValor=somaLinha[j];
					somaLinha[j]=somaLinha[j+1];
					somaLinha[j+1]=auxValor;
					
					auxLinha=linhas[j];
					linhas[j]=linhas[j+1];
					linhas[j+1]=auxLinha;
				}
			}
		}
		//Exibir Ranking
		System.out.println("");
		for(int i=0;i<3;i++) {
			
			System.out.println((i+1)+"° - "+linhas[i]);
			System.out.println("---------------------");
		}
	}

	//D)
	public static void maiorVenda(String[] regioes, int [][]vendas) {
		
		String[] linhas = new String[] {"Perfumaria","Maquiagem","Cabelo"};
		int maiorValor=0,indLinha=0,indRegiao=0;
		
		for(int r=0;r<4;r++) {
			for(int l=0;l<3;l++) {
				if(vendas[r][l]>maiorValor) {
					maiorValor=vendas[r][l];
					indLinha=l;
					indRegiao=r;
				}
			}
		}
		
		System.out.println("Valor: "+maiorValor+" - Região: "+ regioes[indRegiao]
				+" - Linha: "+linhas[indLinha]);
		System.out.println("--------------------------------------------------------");
	}
}


