package h2;

import java.util.Arrays;

public class H2_main {

    public static void main(String[] args) {
        // Testbeispiele
        int[] a1 = {2, 7, 1, 9};
        int[] b1 = {5, 6, 7};
        int[] result1 = change(a1, b1, 2, 4);
        System.out.println(Arrays.toString(result1)); // [2, 7, 1, 9]

        int[] a2 = {2, 7, 1, 9};
        int[] b2 = {2, 7, 1, 9};
        int[] result2 = change(a2, b2, 2, 4);
        System.out.println(Arrays.toString(result2)); // [7, 9]

        int[] a3 = {2, 7, 1, 9};
        int[] b3 = {2, 7, 1, 9};
        int[] result3 = change(a3, b3, 3, 2);
        System.out.println(Arrays.toString(result3)); // []
    }

    // Methode change direkt in H2_main
    public static int[] change(int[] a, int[] b, int start, int end) {
        if (end <= start) {
            // End <= Start -> leeres Array
            return new int[0];
        }

        if (!Arrays.equals(a, b)) {
            // a und b sind nicht identisch -> neues Array mit gleichen Inhalten wie a
            return Arrays.copyOf(a, a.length);
        } else {
            // a und b sind identisch -> sortieren und Teilbereich zurückgeben
            int[] sorted = Arrays.copyOf(a, a.length);
            Arrays.sort(sorted);

            // Kopie des Bereichs start bis end (exklusive end)
            return Arrays.copyOfRange(sorted, start, end);
        }
    }
}
