package last;

import java.util.Scanner;

public class a {
	static Scanner entrada = new Scanner(System.in);
	static String nomes[] = new String[] { "JOÃO", "CARLOS"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regiao[] = new String[] { "Sul", "Sudeste", "Norte", "Nordeste" };

		// A)
		int votos[][] = votos(regiao);
		
		// B)
		int [] somaCand = somaVotos(votos);
		System.out.println("TOTOAL VOTOS DOS CANDIDATOS");
		for(int i=0;i<2;i++) {
			System.out.println(nomes[i]+" total votos: "+somaCand[i]);
		}
		
		// C)
		System.out.println("");
		System.out.println("CANDIDATO COM MAIS VOTOS POR REGIÃO");
		maiorRegiao(regiao,votos);
		
		// D)
		System.out.println("");
		System.out.println("CANDIDATO MAIS VOTADO");
		maiorVotacao(somaCand);
	}

	// A)
	public static int[][] votos(String regiao[]) {
		int votacao[][] = new int[2][4];

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 4; c++) {
				System.out.println("Numero de votos do " + nomes[l] + " na região " + regiao[c] + ": ");
				votacao[l][c] = entrada.nextInt();
			}
		}

		return votacao;
	}

	// B)
	public static int[] somaVotos(int votos[][]) {
		int [] somaCand = new int [2];
		
		for(int c =0;c<2;c++) {
			for(int r=0;r<4;r++) {
				somaCand[c]+=votos[c][r];
			}
		}
		
		
		return somaCand;
		
	}

	// C)
	public static void maiorRegiao(String regiao[], int votos[][]) {
		
		int indRegiao=0;
		int maiorVotos=0;
		
		for(int c=0;c<2;c++) {
			indRegiao=0;
			maiorVotos=0;
			for(int r=0;r<4;r++) {
				if(votos[c][r]>maiorVotos) {
				indRegiao=r;
				maiorVotos=votos[c][r];
				}
			}
			System.out.println(nomes[c]+":"+regiao[indRegiao]);
		}
			
	} 


	// D)
	public static void maiorVotacao(int somaCand[]) {
		int maiorVotos=0,indCand=0;
		for(int i=0;i<2;i++) {
			if(somaCand[i]>maiorVotos) {
				maiorVotos=somaCand[i];
				indCand=i;
			}
		}
		
		System.out.println(nomes[indCand]+"- Total: "+maiorVotos);
	}
}


