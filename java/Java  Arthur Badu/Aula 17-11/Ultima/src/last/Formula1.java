package last;

import java.util.Scanner;

public class Formula1 {

	static Scanner entrada = new Scanner(System.in);
	static String[] nomes = new String[] {"Daniel Riccardo","Kimi Raikkonen","Lewis Hamilton","Nico Rosberg","Sebastian Vettel"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] paises = new String[] {"Bélgica","Itália","Cingapura","Malásia","Japão"};
		
		relatorio(paises);
	}

	
	
	
	static void relatorio(String[]paises){
		
		int pontuacao[][] = pontos(paises);
		int somaPontos[] = somapontos(pontuacao);
		vencedor(pontuacao);
	}
	
	public static int[][] pontos(String[]paises) {
		int pontuacao[][] = new int[5][5]; 
		
		for(int i=0;i<5;i++) {
			System.out.println("Pontuação do Piloto - "+nomes[i]);
			for(int j=0;j<5;j++) {
				System.out.println("Pontuação GP - "+paises[j]+":");
				pontuacao[i][j]=entrada.nextInt();
			}
		}
		return pontuacao;
	}

	public static int []somapontos(int [][]pontuacao) {
		int somaPontos[] = new int[5];
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				somaPontos[i] += pontuacao[i][j];
			}
		}
		
		return somaPontos;
	}

	public static String[]vencedor(int [][]pontuacao,String paises[]){
		String [] gpVencedor = new String [5];
		int maiorPonto =0;
		for(int i=0;i<5;i++) {
			maiorPonto =0;
			String indMaior = "";
			for(int j=0;j<5;j++) {
				if(maiorPonto<pontuacao[j][i]) {
					gpVencedor[j] = pontuacao[j][i];
					indMaior = nomes[i];
				}
			}
		System.out.println(gpVencedor[i]);
		}
		
		return gpVencedor;
	}

	public static void maiorPont(int[]somapontos) {
		int pontoMaior=0;
		String pilotoMaior="";
		
		for(int i=0;i<5;i++) {
			if(pontoMaior<somapontos[i]) {
				pontoMaior = somapontos[i];
				pilotoMaior = nomes;
			}
		}
	}
}
