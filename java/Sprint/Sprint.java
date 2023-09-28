package java_sipi;
import java.util.Scanner;

public class Sprint {

    static Scanner entrada = new Scanner(System.in);
    static int numEqui = 0, ctl2 = 0;

    public static void main(String[] args) {
        while (numEqui < 1) {
            System.out.println("Digite a quantidade de equipes");
            numEqui = entrada.nextInt();
        }

        int[] estetica = new int[numEqui];
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

            // Criar e preencher o array estetica com critérios de desempate

            System.out.println("Digite a nota de estética para a equipe " + (ctl + 1) + ":");
            estetica[ctl] = entrada.nextInt();

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
        System.out.println("Placar:");

        // Calcular os resultados finais
        int[][] result = new int[numEqui][3]; // Adicione um terceiro elemento para os critérios de estética

        ctl = 0;
        while (ctl < numEqui) {
            result[ctl][0] = nomeEqui[ctl];
            result[ctl][1] = pontuacao[ctl];
            result[ctl][2] = estetica[ctl]; // Armazena o critério de estética
            ctl++;
        }

        // Ordenar os resultados em ordem decrescente de pontuação e critério de estética
        
        //quando escrevi isso so eu e deus sabiam como esse treco funcionava agora eu me pergunto se ele sabe pq eu n 
        ctl = 0;
        while (ctl < numEqui - 1) {
            int ctl2 = ctl + 1;
            while (ctl2 < numEqui) {
                if (result[ctl][1] < result[ctl2][1]
                        || (result[ctl][1] == result[ctl2][1] && result[ctl][2] < result[ctl2][2])) {
                    // Troca as equipes de posição
                    int tempEquipe = result[ctl][0];
                    int tempPontuacao = result[ctl][1];
                    int tempEstetica = result[ctl][2];
                    result[ctl][0] = result[ctl2][0];
                    result[ctl][1] = result[ctl2][1];
                    result[ctl][2] = result[ctl2][2];
                    result[ctl2][0] = tempEquipe;
                    result[ctl2][1] = tempPontuacao;
                    result[ctl2][2] = tempEstetica;
                }
                ctl2++;
            }
            ctl++;
        }

        // Imprimir os resultados finais
        System.out.println(" ");
        System.out.println("Equipe  Pontuação Estética");
        ctl = 0;
        while (ctl < numEqui) {
            System.out.println(result[ctl][0] + "\t" + result[ctl][1] + "\t" + result[ctl][2]);
            ctl++;
        }
    }
}
