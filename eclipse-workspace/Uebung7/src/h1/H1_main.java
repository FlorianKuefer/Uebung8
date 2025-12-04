package h1;

public class H1_main {

    public static void main(String[] args) {

        // Beispielhafte Initialisierung
        Zahl z = new Zahl();
        z.num = -16;     // beliebiger Startwert
        z.setEven();
        z.setPositive();
        z.setSmall();

        // Beispielhafte Ausgabe
        System.out.println("num: " + z.num);
        System.out.println("even: " + z.even);
        System.out.println("positive: " + z.positive);
        System.out.println("small: " + z.small);
    }
}

class Zahl {

    public boolean even;
    public boolean small;
    public boolean positive;
    public int num;

    public void setEven() {
        if (Math.abs(num) % 2 == 0) {   // Betrag von num hat Rest 0 beim teilen durch 2
            even = true;
        } else {
            even = false;
        }
    }

    public void setSmall() {
        small = num < 100;
    }

    public void setPositive() {
        positive = num > 0;
    }
}
