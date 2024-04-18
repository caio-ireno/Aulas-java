package pilha;

public class Main {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<>();

		pilha.push(1);
		pilha.push(2);
		pilha.push(3);

		System.out.println("Elemento no topo: " + pilha.top()); // Deve imprimir 3
		System.out.println("Tamanho da pilha: " + pilha.size()); // Deve imprimir 3

		pilha.pop();
		System.out.println("Elemento removido do topo: " + pilha.pop()); // Deve imprimir 2
		System.out.println("Tamanho da pilha após remoção: " + pilha.size()); // Deve imprimir 1
	}

}
