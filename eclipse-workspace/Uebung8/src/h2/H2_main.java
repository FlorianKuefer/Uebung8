package h2;

class Node {
    int value;
    Node next;

    // Konstruktor
    public Node(int value) {
        this.value = value;
        this.next = null;  // zunächst kein Nachfolger
    }
}

class SimpleList {

    Node head; // Kopfknoten

    // Konstruktor: Kopfknoten mit Dummy-Wert anlegen
    public SimpleList() {
        head = new Node(Integer.MIN_VALUE);
    }

    // Gibt ersten echten Knoten zurück
    public Node getFirst() {
        return head.next; // kann null sein
    }

    // Gibt letzten Knoten zurück
    public Node getLast() {
        if (head.next == null) return null;

        Node current = head.next;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    // Fügt einen neuen Wert hinten an
    public void append(int newValue) {
        Node newNode = new Node(newValue);

        // Wenn Liste leer ist → direkt an head hängen
        if (head.next == null) {
            head.next = newNode;
            return;
        }

        // sonst letzten Knoten suchen
        Node last = getLast();
        last.next = newNode;
    }

    // Sucht erstes Vorkommen eines Wertes
    public Node findFirst(int value) {
        Node current = head.next;

        while (current != null) {
            if (current.value == value) return current;
            current = current.next;
        }

        return null; // nicht gefunden
    }

    // Fügt newValue hinter dem ersten Knoten ein, der preValue speichert
    public boolean insertAfter(int preValue, int newValue) {
        Node found = findFirst(preValue);

        if (found == null) {
            return false; // Einfügen nicht möglich
        }

        Node newNode = new Node(newValue);
        newNode.next = found.next;
        found.next = newNode;

        return true;
    }

    // Löscht ersten Knoten mit gegebenem value
    public boolean delete(int value) {
        Node prev = head;
        Node current = head.next;

        while (current != null) {
            if (current.value == value) {
                prev.next = current.next; // überspringen = löschen
                return true;
            }
            prev = current;
            current = current.next;
        }

        return false; // value nicht gefunden
    }

    // Hilfsmethode zur Ausgabe
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head.next;

        while (current != null) {
            sb.append(current.value);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }

        return sb.toString();
    }
}

public class H2_main {
    public static void main(String[] args) {

        SimpleList myList = new SimpleList();

        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        System.out.println("Liste nach append:     " + myList);

        myList.insertAfter(45, 4);
        System.out.println("Nach insertAfter:      " + myList);

        Node found = myList.findFirst(45);
        System.out.println("findFirst(45) → Node mit Wert: " + found.value);

        myList.delete(45);
        System.out.println("Nach delete(45):       " + myList);
    }
}
