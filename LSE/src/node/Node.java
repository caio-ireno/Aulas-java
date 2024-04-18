package node;

public class Node {
    public String airportCode;
    public Node next;

    public Node(String airportCode) {
        this.airportCode = airportCode;
        this.next = null;
    }
}

