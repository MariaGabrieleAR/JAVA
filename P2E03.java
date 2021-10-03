import java.util.Scanner;

public class P2E03 {


	public static void main(String[] args) {
		ContaCorrente C1 = new ContaCorrente(6560,500);
		C1.setNumCC(6560);
		C1.setSaldoCC(500);
		
		ContaCorrente C2 = new ContaCorrente(6561,800);
		C2.setNumCC(6561);
		C2.setSaldoCC(800);
		
		System.out.println("Número da conta:" + C1.getNumCC() + "\n" + "Saldo:" + C1.getSaldoCC());
		
		Scanner input = new Scanner(System.in); 
			System.out.println("Valor do saque: ");
			double saque = input.nextDouble();
			
			
			C1.sacar(saque);
			
			System.out.println("Saldo: " + C1.getSaldoCC());
			System.out.println();
			
			System.out.println("Conta de número: " + C2.getNumCC() + "\n" + "saldo: " + C2.getSaldoCC());
			System.out.println("Valor a despositar: ");
			double deposito = input.nextDouble();
			
			C2.depositar(deposito);
			
		
		System.out.println("Saldo: " + C2.getSaldoCC());

	}

}
