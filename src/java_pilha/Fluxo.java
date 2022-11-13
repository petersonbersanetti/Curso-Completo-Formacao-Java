package java_pilha;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (Exception ex) { 
//			RuntimeException | NullPointerException | ArithmeticException (unchecked nao verificados pelo compilador)
			String error = ex.getMessage();
			System.out.println("Error " + error);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo 1");
		try {
		metodo2();
		} catch (MinhaExcecao ex) {
		System.out.println("Fim do metodo 1");
		}
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo 2");
		int a = 2/0;
		throw new MinhaExcecao("Deu muito Errado");
		// System.out.println("Fim do método 2");
	}

}
