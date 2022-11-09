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
		if (this.tipo == 0) { // 0 = Funcionário comum; 1 = Gerente; 2 = Diretor
			System.out.println(getTipo() + " - Funcionario");
			return this.salario * 0.1;
		} else if (this.tipo == 1) {
			System.out.println(getTipo() + " - Gerente");
			return this.salario;
		} else {
			System.out.println(getTipo() + " - Diretor");
			return this.salario + 1000.0;
		}
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
