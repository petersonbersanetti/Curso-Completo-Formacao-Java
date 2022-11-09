package byte_bank_herdado;

public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	private int tipo = 0; // 0 = Funcionário comum; 1 = Gerente; 2 = Diretor

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Funcionario() {

	}

	public double getBonificacao() {
			return this.salario * 0.05;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
