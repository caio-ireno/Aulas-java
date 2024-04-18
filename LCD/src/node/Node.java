package node;

class Node {
    String airportCode;
    Node next;
    Node prev;

    public Node(String airportCode) {
        this.airportCode = airportCode;
        this.next = null;
        this.prev = null;
    }
}
