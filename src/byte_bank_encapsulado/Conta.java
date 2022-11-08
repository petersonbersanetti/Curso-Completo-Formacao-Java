package byte_bank_encapsulado;

public class Conta {
	// atributos
	// método deposita
	// método saca
	// método transfere
	// método pegaSaldo
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Cliente titular = new Cliente(); metodo para nao precisar criar
	// (contaDaShanti.titular = new Cliente();

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

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int novaAgencia) {
		this.agencia = novaAgencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente novoTitular) {
		this.titular = novoTitular;
	}
}
