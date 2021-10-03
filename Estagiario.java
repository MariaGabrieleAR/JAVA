
public class Estagiario extends Funcionario {
	
	public Estagiario (int idFunc, String nomeFuc, double salarioHora) {
		super (idFunc, nomeFuc, salarioHora);
	}

	
	public double calculaSalario (double horasTrabalhadas) {
		double salBruto = salarioHora*horasTrabalhadas;
		double salLiquido;
			 if(salBruto <= 1000.00)
			 salLiquido = 1000.0;
			 
			 else
			 salLiquido = salBruto;
			 return salLiquido;
			 
	}
	
	public double bonificacao(){
		 return super.bonificacao() + 200;
		 }
}
