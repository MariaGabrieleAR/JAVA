
public class TestaSobrecarga {

	public static void main(String[] args) {
		
		Funcionario F1 = new Funcionario (323, "Pedro da Cota", 35.00);
		Estagiario E1 = new Estagiario (548,"Miranda Lima", 22.00);
		System.out.println("Salario Funcion�rio=" +F1.calculaSalario(160));
		System.out.println("Salario Estagi�rio= " +E1.calculaSalario(120));
		System.out.println("Bonifica��o Funcion�rio=" +F1.bonificacao());
		System.out.println("Bonifica��o Estagi�rio=" +E1.bonificacao());
	}

}
