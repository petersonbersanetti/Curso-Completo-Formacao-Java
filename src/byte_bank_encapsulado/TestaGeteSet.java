package byte_bank_encapsulado;

public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,222);
		System.out.println(conta.getNumero());

		Cliente gabi = new Cliente();
		gabi.setNome("Gabriela Massako");
		conta.setTitular(gabi);

		System.out.println(conta.getTitular().getNome());

		conta.getTitular().setProfissao("Naturóloga");

		// mesma coisa da linha de cima
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Naturóloga");

		System.out.println(titularDaConta);
		System.out.println(gabi);
		System.out.println(conta.getTitular());

	}
}
