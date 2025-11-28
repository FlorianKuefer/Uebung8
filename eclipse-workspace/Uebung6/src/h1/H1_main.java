package h1;

public class H1_main {

    // Geforderte Methode
    public static boolean isMirrorArray(int[] a, int[] b) {
        // Wenn die Längen unterschiedlich sind → nicht spiegelbildlich
        if (a.length != b.length) {
            return false;
        }

        // Vergleiche a[i] mit b[length-1-i]
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[b.length - 1 - i]) {
                return false;
            }
        }
        
        // Wenn alle Elemente passen → true
        return true;
    }

    // Testbeispiele
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {4, 3, 2, 1};
        int[] c = {2, 4, 6};
        int[] d = {6, 4, 9};

        System.out.println("isMirrorArray(a, b): " + isMirrorArray(a, b)); 
        System.out.println("isMirrorArray(b, a): " + isMirrorArray(b, a)); 
        System.out.println("isMirrorArray(c, d): " + isMirrorArray(c, d)); 
        

    }
}
