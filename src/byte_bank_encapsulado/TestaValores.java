package byte_bank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1234,4321);
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
	}
}
