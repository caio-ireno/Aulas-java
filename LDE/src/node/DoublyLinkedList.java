package node;

public class DoublyLinkedList  {
    private Node head;
    private Node tail;

    // Método para inserir um novo nó no início da lista
    public void inserirNoInicio(Node novoNode) {
    	//o "next" do meu novo nó que eu quero inserir no inicio, ele vai apontar para a referencia que head tinha (antigo primeiro nó)
    	// e o "prev" do meu novo nó, deve apontar para null, pois é o primeiro
        novoNode.next = head;
        novoNode.prev = null;
        
        //Se o meu head, ja for alguma coisa (ele nao é nulo), a referencia "prev" do antigo primeiro é o mei novo primeiro
        if (head != null) {
            head.prev = novoNode;
        }
        
        // Aqui eu mudo a referencia do meu head, pois agora eu tenho um novo primeiro
        head = novoNode;
        
        // caso esteja vazio, o tail tambem aponta para o novo nó
        if (tail == null) {
            tail = novoNode;
        }
    }
    

    // Método para inserir um novo nó no final da lista
    public void inserirNoFinal(Node novoNode) {
    	//Se o meu tail, tiver alguma referencia (naõ for nulo), o next do meu antigo ultimo, vai apontar pro meu novo ultimo
    	// e o "prev" do meu novo vai apontar pro, antigo ultimo.
        if (tail != null) {
            tail.next = novoNode;
            novoNode.prev = tail;
        }
        //Se a lista estiver vazio, ele aponta para o head tbm
        if (head == null) {
            head = novoNode;
        }
        
        // Mudo a referencia do meu utlimo, agora o meu ultimo é o meu novo ultimo
        tail = novoNode;
    }

    // Método para inserir um novo nó após um nó específico na lista
    public void inserirNoMeio(Node novoNode, Node nodeAnterior) {
        if (nodeAnterior == null) {
            return;
        }
        
        /* O next do meu novo vai apontar pro que o anterior apontava
         * 
         * MSP LAX (ATL) BOS 

         * MSP LAX ATL Caio BOS 

        */
        novoNode.next = nodeAnterior.next;
        //
        if (nodeAnterior.next != null) {
        	// o next do anterior aponta para o novo nó
            nodeAnterior.next = novoNode;
        }
        
        novoNode.prev = nodeAnterior;
        if (nodeAnterior == tail) {
            tail = novoNode;
        }
    }

    // Método para remover um nó do início da lista
    public void removerDoInicio() {
        if (head == null) {
            return;
        }
        
        /*
         * (chile) MSP BRASIL ARGENTINA LAX ATL BOS 

         * o meu head ele vai ser a referencia do next do head anterior
         * e o prev vai ser null,pois a cabeça prev aponta para null
         * 
         */
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        if (head == null) {
            tail = null;
        }
    }

    // Método para remover um nó do final da lista
    public void removerDoFinal() {
        if (tail == null) {
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }
        if (tail == null) {
            head = null;
        }
    }

    // Método para remover um nó específico da lista
    public void remover(Node node) {
        if (node == null) {
            return;
        }
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    // Método para imprimir os elementos da lista do início para o final
    public void imprimirInicioParaFinal() {
    	//você está declarando uma variável chamada current do tipo Node.
        Node current = head;
        while (current != null) {
            System.out.print(current.airportCode + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Método para imprimir os elementos da lista do final para o início
    public void imprimirFinalParaInicio() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.airportCode + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Método main para testar a lista encadeada
    public static void main(String[] args) {
        DoublyLinkedList lista = new DoublyLinkedList();

        // Inserindo alguns nós na lista
        Node laxNode = new Node("LAX");
        /*airportCode = "LAX"
        next = null
        prev = null
        */

        Node mspNode = new Node("MSP");
        /*
        airportCode = "msp"
        next = null
        prev=null
        */

        Node atlNode = new Node("ATL");
        Node bosNode = new Node("BOS");

        Node nycNode = new Node("NYC")


        lista.inserirNoInicio(laxNode);
        lista.inserirNoInicio(mspNode);
        lista.inserirNoFinal(atlNode);
        lista.inserirNoFinal(bosNode);
        
        lista.inserirNoMeio(nycNode, atlNode)
        

        // Imprimindo a lista do início para o final
        System.out.println("Lista encadeada do início para o final:");
        lista.imprimirInicioParaFinal();
//
//        // Imprimindo a lista do final para o início
//        System.out.println("\nLista encadeada do final para o início:");
//        lista.imprimirFinalParaInicio();
//
//        // Removendo um nó do início da lista
//        lista.removerDoInicio();
//
//        // Removendo um nó do final da lista
//        lista.removerDoFinal();
//
//        // Imprimindo a lista após as remoções
//        System.out.println("\nLista encadeada após remoções:");
//        lista.imprimirInicioParaFinal();
    }
    

}
