package menorAltura;
import java.util.Scanner;

public class atividadeMenorA {

	public static void main(String[] args) {
		Scanner ze = new Scanner (System.in);
		int contador=0;
		double altura, menorAltura=99;
		String nome, menorNome=null;
		do {
			System.out.print("Entre um nome...:");
			nome= ze.nextLine();
			System.out.print("Entre uma altura...:");
			altura= Double.parseDouble(ze.nextLine());
			if(altura<menorAltura) {
				menorAltura=altura;
				menorNome=nome;
			}
			contador++;
		} while(contador<10);
		System.out.println("Menor altura...:" +menorAltura);
		System.out.println("Nome...." +menorNome);
		
		ze.close();
		
		
		 

	}

}
