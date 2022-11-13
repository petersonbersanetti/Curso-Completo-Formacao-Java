package java_pilha;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
		metodo1();
		} catch (Exception ex) {
			String error = ex.getMessage();
			System.out.println("Error " +error);
//			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo 2");
		throw new MinhaExcecao("Deu Errado");
		//System.out.println("Fim do método 2");
	}

}
