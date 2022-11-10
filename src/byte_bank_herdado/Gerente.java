package byte_bank_herdado;

// a classe gerente e funcioario é um autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o método bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
