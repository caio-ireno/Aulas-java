package main;

import node.Node;

public class Main {

	public static void main(String[] args) {
		
        Node laxNode = new Node("LAX");
        Node mspNode = new Node("MSP");
        Node atlNode = new Node("ATL");
        Node bosNode = new Node("BOS");
        Node jfkNode = new Node("JFK");

        laxNode.next = mspNode;
        mspNode.next = atlNode;
        atlNode.next = bosNode;
        bosNode.next = jfkNode;

    
        Node currentNode = laxNode; 
        while (currentNode != null) {
            System.out.println("Código do Aeroporto: " + currentNode.airportCode);
            currentNode = currentNode.next; 
        }
	}

}
