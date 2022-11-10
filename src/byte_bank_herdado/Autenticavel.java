package byte_bank_herdado;

//transformamos a classe autentivel em interface (um contrato que voce está assinando)

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
}