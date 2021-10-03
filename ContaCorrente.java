
public class ContaCorrente {
	private int numCC;
	private double saldoCC;
	
	public ContaCorrente(int numCC, double saldoCC) {
		this.numCC = numCC;
		this.saldoCC = saldoCC;
	}

	public int getNumCC() {
		return numCC;
	}

	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
	
	public double depositar(double valor) {
		return saldoCC = saldoCC + valor;
	
		
	}
	public double sacar(double valor) {
		return saldoCC = saldoCC - valor;
	}
	
	
	
}
