package h2;

public class SimpleList {

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
