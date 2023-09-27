package java_sipi;
import java.util.Scanner;

public class gpt {

	    static Scanner entrada = new Scanner(System.in);
	    static int numEqui = 0 ,ctl2=0;

	    public static void main(String[] args) {
	        while (numEqui < 1) {
	            System.out.println("Digite a quantidade de equipes");
	            numEqui = entrada.nextInt();
	        }

	        int[] pontuacao = new int[numEqui];
	        int[] nomeEqui = new int[numEqui];
	        int ctl = 0;

	        int numBat = 0;
	        while (ctl < numEqui) {
	            int ctl2 = 0;

	            while (nomeEqui[ctl] > 99 || nomeEqui[ctl] < 11) {
	                System.out.println("Digite o número da " + (ctl + 1) + "ª equipe");
	                nomeEqui[ctl] = entrada.nextInt();
	                if (nomeEqui[ctl] > 99 || nomeEqui[ctl] < 11) {
	                    System.out.println("Valor inválido, tente novamente");
	                    nomeEqui[ctl] = 0;
	                }
	            }

	            while (numBat < 1) {
	                System.out.println("Digite a quantidade de batalhas");
	                numBat = entrada.nextInt();
	                if (numBat < 1) {
	                    System.out.println("Inválido");
	                }
	            }

	            char luta = 'z';
	            while (ctl2 < numBat) {
	                System.out.println("Digite o resultado da " + (ctl2 + 1) + "ª Luta");
	                System.out.println("V - Para Vitória");
	                System.out.println("E - Para Empate");
	                System.out.println("D - Para Derrota");
	                System.out.println("");
	                luta = Character.toUpperCase(entrada.next().charAt(0));

	                if (luta == 'V') {
	                    pontuacao[ctl] += 5;
	                    ctl2++;
	                } else if (luta == 'E') {
	                    pontuacao[ctl] += 3;
	                    ctl2++;
	                } else if (luta == 'D') {
	                    ctl2++;
	                } else {
	                    System.out.println("Inválido");
	                }
	                luta = 'z';
	            }

	            ctl++;
	        }

	       
	        System.out.println(" ");
	        System.out.println("Equipe  Pontuação");
	        for (int j = 0; j < numEqui; j++) {
	            
	                System.out.print(pontuacao[j] + "\t");
	 
	        }

	        // Calcular os resultados finais
	        int[][] result = new int[numEqui][2];

	        for (int i = 0; i < numEqui; i++) {
	            result[i][0] = nomeEqui[i];
	            result[i][1] = pontuacao[i];
	        }

	        // Ordenar os resultados em ordem decrescente de pontuação
	        for (int i = 0; i < numEqui - 1; i++) {
	            for (int j = i + 1; j < numEqui; j++) {
	                if (result[i][1] < result[j][1]) {
	                    // Troca as equipes de posição
	                    int tempEquipe = result[i][0];
	                    int tempPontuacao = result[i][1];
	                    result[i][0] = result[j][0];
	                    result[i][1] = result[j][1];
	                    result[j][0] = tempEquipe;
	                    result[j][1] = tempPontuacao;
	                }
	            }
	        }

	        // Imprimir os resultados finais
	        System.out.println(" ");
	        System.out.println("Equipe  Pontuação");
	        for (int j = 0; j < numEqui; j++) {
	            System.out.println(result[j][0] + "\t" + result[j][1]);
	        }
	    }
}
