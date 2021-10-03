
public class TestaSobrecarga {

	public static void main(String[] args) {
		
		Funcionario F1 = new Funcionario (323, "Pedro da Cota", 35.00);
		Estagiario E1 = new Estagiario (548,"Miranda Lima", 22.00);
		System.out.println("Salario Funcionário=" +F1.calculaSalario(160));
		System.out.println("Salario Estagiário= " +E1.calculaSalario(120));
		System.out.println("Bonificação Funcionário=" +F1.bonificacao());
		System.out.println("Bonificação Estagiário=" +E1.bonificacao());
	}

}
