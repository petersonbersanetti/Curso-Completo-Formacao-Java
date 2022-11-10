package byte_bank_herdado;

import java.util.Scanner;

public class TesteSistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(222);
		
		Gerente g = new Gerente();
		System.out.println("Bom dia, Gerente, digite sua senha: ");
		int gsenha = sc.nextInt();
		g.setSenha(gsenha);
		
		Administrador adm = new Administrador();
		System.out.println("Bom dia, Administrador digite sua senha: ");
		int admsenha = sc.nextInt();
		adm.setSenha(admsenha);

		SistemaInterno si = new SistemaInterno();
		si.autentica(cliente);
		si.autentica(g);
		si.autentica(adm);
		
		sc.close();
	}
}
