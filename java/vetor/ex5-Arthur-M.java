package aula_java;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ctl = 0, ctl2 = 0, tamanho = 0;
		int[][] semes1 = new int[5][3];
		int[][] semes2 = new int[5][3];
		int[][] ano = new int[5][3];
		int[] soma_ano = new int[3];
		int[] soma_cursos = new int[5];
		int[] maior_matricola = new int[5];

		while (ctl < 3) {
			while (ctl2 < 5) {
				semes1[ctl2][ctl] = (int) (Math.random() * 100);
				semes2[ctl2][ctl] = (int) (Math.random() * 100);

				ctl2++;
			}
			ctl2 = 0;
			ctl++;
		}

		ctl = 0;
		ctl2 = 0;

		while (ctl < 3) {
			while (ctl2 < 5) {
				ano[ctl2][ctl] = semes1[ctl2][ctl] + semes2[ctl2][ctl];

				soma_ano[ctl] += ano[ctl2][ctl];
				soma_cursos[ctl2] += ano[ctl2][ctl];

				ctl2++;
			}
			ctl2 = 0;
			ctl++;
		}
		
		ctl = 0;
		ctl2 = 0;
		while (ctl < 5) {
			while (ctl2 < 3) {
				if(maior_matricola[ctl]==0) {
					maior_matricola[ctl]=ano[ctl][ctl2];
				}else {
					if(maior_matricola[ctl]<ano[ctl][ctl2]) {
						maior_matricola[ctl]=ano[ctl][ctl2];
					}
				}
					

				ctl2++;
			}
			ctl2 = 0;
			ctl++;
		}



		System.out.println(" ");
		System.out.println("Matriculas Primeiro Semestre");
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 3; i++) {
				System.out.print(semes1[j][i] + "\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Matriculas Segundo Semestre");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(semes2[i][j] + "\t");

			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Matriculas anuais Semestre");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ano[i][j] + "\t");

			}
			System.out.println(" ");

		}
		System.out.println(" ");
		System.out.println("soma de todos os cursos por unidade");
		for (int i = 0; i < 3; i++) {

			System.out.print(soma_ano[i] + "\t");

			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("soma cursos todas unidades");
		for (int i = 0; i < 5; i++) {

			System.out.print(soma_cursos[i] + "\t");

			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("maior matricula");
		for (int i = 0; i < 5; i++) {

			System.out.print(maior_matricola[i] + "\t");

			System.out.println(" ");
		}
	}

}
