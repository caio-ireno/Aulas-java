package node;

public class CircularDoublyLinkedList {
    private Node head;
    private Node tail;

    // Método para inserir um novo nó no início da lista
    public void inserirNoInicio(Node novoNode) {
        if (head == null) {
            head = novoNode;
            tail = novoNode;
            head.next = head;
            head.prev = head;
        } else {
            novoNode.next = head;
            novoNode.prev = tail;
            head.prev = novoNode;
            tail.next = novoNode;
            head = novoNode;
        }
    }

    // Método para inserir um novo nó no final da lista
    public void inserirNoFinal(Node novoNode) {
        if (head == null) {
            head = novoNode;
            tail = novoNode;
            head.next = head;
            head.prev = head;
        } else {
            novoNode.prev = tail;
            novoNode.next = head;
            tail.next = novoNode;
            head.prev = novoNode;
            tail = novoNode;
        }
    }

    // Método para remover um nó do início da lista
    public void removerDoInicio() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // Método para remover um nó do final da lista
    public void removerDoFinal() {
        if (tail == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }
    
 // Método para imprimir os elementos da lista do início para o final
    public void imprimirInicioParaFinal() {
        if (head == null) {
            return;
        }
        Node current = head;
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteração " + (i + 1) + ":");
            do {
                System.out.print(current.airportCode + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    // Método para imprimir os elementos da lista do final para o início
    public void imprimirFinalParaInicio() {
    	
        if (tail == null) {
            return;
        }
        Node current = tail;
        do {
            System.out.print(current.airportCode + " ");
            current = current.prev;
        } while (current != tail);
        System.out.println("\nLista é circular.");
    }
    
    public static void main(String[] args) {
        CircularDoublyLinkedList lista = new CircularDoublyLinkedList();

        // Inserindo alguns nós na lista
        Node laxNode = new Node("LAX");
        Node mspNode = new Node("MSP");
        Node atlNode = new Node("ATL");
        Node bosNode = new Node("BOS");

        lista.inserirNoInicio(laxNode);
        lista.inserirNoInicio(mspNode);
        lista.inserirNoFinal(atlNode);
        lista.inserirNoFinal(bosNode);

        // Imprimindo a lista do início para o final
        System.out.println("Lista encadeada do início para o final:");
        lista.imprimirInicioParaFinal();

        // Imprimindo a lista do final para o início
        System.out.println("\nLista encadeada do final para o início:");
        lista.imprimirFinalParaInicio();

        // Removendo um nó do início da lista
        lista.removerDoInicio();

        // Removendo um nó do final da lista
        lista.removerDoFinal();

    }
}

