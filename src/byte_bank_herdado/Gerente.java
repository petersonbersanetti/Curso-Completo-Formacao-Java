package byte_bank_herdado;

public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Chamando o método bonificacao do GERENTE");
		return super.getSalario();
	}
}
