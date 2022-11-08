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
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("SUA CONTA FOI CRIADA COM SUCESSO.s \nAgencia: " +this.agencia + " Conta: " +this.numero);
	}

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
		if (numero <= 0) {
			System.out.println("O número da conta não pode ser negativo!");
			return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int novaAgencia) {
		if (agencia <= 0) {
			System.out.println("O numero da agencia nao pode ser negativo!");
			return;
		}
		this.agencia = novaAgencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente novoTitular) {
		this.titular = novoTitular;
	}
}
