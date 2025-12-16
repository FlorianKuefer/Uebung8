package h1;

public class H1_main {

	public static void main(String[] args) {
		
	 Bruch b1 = new Bruch(25, 5);
        Bruch b2 = new Bruch(8, 12);
        Bruch b3 = new Bruch(4, 3);
        Bruch b4 = new Bruch(15, 9);
    

        b1.shorten();
        b2.shorten();
        b3.shorten();

        System.out.println("b1: " + b1); 
        System.out.println("b2: " + b2); 
        System.out.println("b3: " + b3); 

        System.out.println("b3 hat selben Wert wie b4? " + b3.hasSameValueAs(b4));
    }
}
	
