package edu.cpp.cs240.list.integer.string;

public class Node {

    private String value;
    private Node next;

    public Node(String value) {
        this.value = value;
        this.next = null;
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
