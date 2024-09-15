package models;

public class Node {
    public Contact contact;
    public Node next;

    public Node(Contact contact) {
        this.contact = contact;
        this.next = null;
    }
}
