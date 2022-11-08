package byte_bank_composto;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	// Cliente titular = new Cliente(); metodo para nao precisar criar (contaDaShanti.titular = new Cliente();

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
