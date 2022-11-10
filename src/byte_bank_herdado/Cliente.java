package byte_bank_herdado;

public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 

	}

 
	public boolean autentica(int senha) {
	 return this.autenticador.autentica(senha);
	}
}

