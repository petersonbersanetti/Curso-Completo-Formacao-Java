
public class TestaMetodo {

	public static void main(String[] args) {

		Conta Peterson = new Conta();
		Conta Gabriela = new Conta();
		
		Peterson.deposita(700);
		Gabriela.deposita(200);
		
		System.out.println("Saldo Peterson "+Peterson.saldo);
		System.out.println("Saldo Gabriela "+Gabriela.saldo);
		
		Peterson.transfere(400, Gabriela);
		
		System.out.println("Saldo Peterson "+Peterson.saldo);
		System.out.println("Saldo Gabriela "+Gabriela.saldo);
		
		Peterson.saca(100);
		System.out.println("Saldo Peterson "+Peterson.saldo);
		
		Gabriela.deposita(100);
		System.out.println("Saldo Gabriela "+Gabriela.saldo);

	}

}
