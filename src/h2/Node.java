package h2;

public class Node {
    int value;
    Node next;

    // Konstruktor
    public Node(int value) {
        this.value = value;
        this.next = null;  // zunächst kein Nachfolger
    }
}
