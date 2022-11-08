package byte_bank_composto;

public class Testabanco {

	public static void main(String[] args) {
		Cliente snow = new Cliente();

		snow.nome = "Snowzinho";
		snow.cpf = "08112022";
		snow.profissao = "Testador de sono";

		Conta contaDoSnow = new Conta();
		contaDoSnow.deposita(100);

		contaDoSnow.titular = snow;
		System.out.println(contaDoSnow.titular.nome);
		System.out.println(contaDoSnow.titular);

	}

}
