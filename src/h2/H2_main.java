package h2;

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
