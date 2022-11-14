package java_pilha;

public class TesteConexao {

	public static void main(String[] args) {
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
			con.fecha();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
//			con.fecha();
		} finally {// bloco opcional porém sempre sera executado
			con.fecha();
		}
	}

}
