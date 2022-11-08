package byte_bank_composto;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDaShanti = new Conta();
		System.out.println(contaDaShanti.saldo);
		
		contaDaShanti.titular = new Cliente();
		System.out.println(contaDaShanti.titular);
		
		contaDaShanti.titular.nome = "Shantizinha";
		System.out.println(contaDaShanti.titular.nome);
	}

}
