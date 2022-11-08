package byte_bank_composto;

public class TestaSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		conta.saca(101);
		System.out.println(conta.getSaldo());

//		proibido usar atributos, sempre usar o método
//		conta.saldo = conta.saldo - 101;
//		System.out.println(conta.saldo);

	}

}
