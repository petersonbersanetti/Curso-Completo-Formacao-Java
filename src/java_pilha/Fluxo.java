package java_pilha;

public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo 2");
		for (int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("Fim do método 2");
	}

}