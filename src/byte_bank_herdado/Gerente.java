package byte_bank_herdado;

public class Gerente extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		System.out.println("Chamando o método bonificacao do GERENTE");
		return super.getSalario();
	}
}
