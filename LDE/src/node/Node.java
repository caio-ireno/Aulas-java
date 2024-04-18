package node;

class Node {
    String airportCode;
    Node next;
    Node prev;

    public Node(String airportCode) {
        this.airportCode = airportCode;
        
        /*this.next = null; e this.prev = null;: Aqui, você está inicializando as variáveis next e prev como null, 
        indicando que o novo nó ainda não está conectado a nenhum outro nó na lista encadeada. 
        Isso significa que, por padrão, um novo nó não tem nenhum nó anterior (prev) ou seguinte (next). 
        Essas referências serão definidas mais tarde, quando você inserir o nó na lista.
        */
        this.next = null;
        this.prev = null;
    }
}

