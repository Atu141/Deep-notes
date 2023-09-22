package metodo;
import java.util.Scanner;
public class ex3 {
	static Scanner entrada = new Scanner(System.in);
	
	
	
	
	
	public static void aprov(double media) {
		int num1 = 0, num2 = 0;
		if(media<=3) {
			System.out.println("DP");
		}else if(media<=6) {
			System.out.println("exame");
		}else {
			System.out.println("aprovado");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media=0;
		System.out.println("digite o seu Nome ");
		media = entrada.nextDouble();
		
		System.out.println("digite ");
		media = entrada.nextDouble();
		
		System.out.println("digite o primeiro numero ");
		media = entrada.nextDouble();
		aprov(media);
		
		
		
	}

}
