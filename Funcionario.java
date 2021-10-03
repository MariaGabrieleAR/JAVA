
public class Funcionario {
	protected int idFunc;
	protected String nomeFunc;
	protected double salarioHora;
	
	public Funcionario (int idFunc, String nomeFunc, double salarioHora) {
		this.idFunc = idFunc;
		this.nomeFunc = nomeFunc;
		this.salarioHora= salarioHora;
	}
	
	//calculo do salario liquido
	
	public double calculaSalario (double horasTrabalhadas) {
		double salBruto = salarioHora*horasTrabalhadas;
		double salLiquido;
		
		if (salBruto <= 1000.00)
			 salLiquido = salBruto;
			 
		else
			 if(salBruto <= 2000.00)
			 salLiquido = salBruto * 0.9;
			
			 else
			 salLiquido = salBruto * 0.85;
			 return salLiquido;
			 
	}
	
	public double bonificacao(){
		 return salarioHora * 50;}

}
