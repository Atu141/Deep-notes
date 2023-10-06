package metodos;

import java.util.Scanner;

public class Ex06 {
	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char sexo[] = sexo();
		char olhos[] = olho();
		char cabelos[]=cabelo();
		int idades[] = idade();
		
		double mediaOlhosCabelo =mediaOlhosCabelos(idades, olhos,cabelos);
		System.out.println("Média de idade das pessoas com olhos castanhos e cabelos pretos: " +mediaOlhosCabelo );
		System.out.println("");
		
		double maiorIdade = maiorIdade(idades);
		System.out.println("Maior idade entre os habitantes: "+maiorIdade);
		System.out.println("");
		
		double qtdFeminino= qtdF(sexo,olhos,cabelos,idades);
		System.out.println("Quantidade de individuos do sexo feminino, entre 18 e 35 anos, tenham olhos azuis e cabelos loiros:"+ qtdFeminino);
		

	}

	public static char[] sexo() {
		char sexo[] = new char[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o sexo da " + (i + 1) + "º pessoa: ");
			sexo[i] = e.next().charAt(0);
		}

		return sexo;

	}

	public static char[] olho() {
		char olhos[] = new char[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite os olhos da " + (i + 1) + "º pessoa: ");
			olhos[i] = e.next().charAt(0);
		}

		return olhos;

	}
	
	public static char[] cabelo() {
		char cabelos[]=new char[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite a cor de cabelo da " + (i + 1) + "º pessoa: ");
			cabelos[i]=e.next().charAt(0);
		}
		
		return cabelos;
	}
	
	public static int[] idade() {
		int idades [] = new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite a idade da " + (i + 1) + "º pessoa: ");
			idades[i] = e.nextInt();		}
		
		return idades;
		
		
		
	}
	
	
	public static double mediaOlhosCabelos(int idades[], char olhos[], char cabelos[]) {
		double mediaOlhosCabelo=0;
		int aux=0;
		
		for(int i=0;i<5;i++) {
			if(olhos[i] == 'c' && cabelos[i] == 'p') {
				mediaOlhosCabelo += idades[i];
				aux++;
			}
		}
		
		mediaOlhosCabelo = mediaOlhosCabelo/aux;
		
		
		return mediaOlhosCabelo;
		
		
	}
	
	public static double maiorIdade (int idades[]) {
		double maiorIdade =0;
		 for(int i=0;i<5;i++) {
			 if(idades[i]>0) {
				 maiorIdade=idades[i];
			 }else {
				 if(idades[i]>maiorIdade) {
					 maiorIdade=idades[i];
				 }
			 }
		 }
		
		
		return maiorIdade;
	}
	
	public static int qtdF(char[]sexo,char[]olhos,char[]cabelos,int[]idades) {
		int qtdFeminino =0;
		
		for(int i=0;i<5;i++) {
			if(sexo[i]=='f' && (idades[i]>18||idades[i]<35) && olhos[i]=='a' && cabelos[i]=='l') {
				qtdFeminino++;
			}
		}
		
		
		return qtdFeminino;
	}
	
	

}
