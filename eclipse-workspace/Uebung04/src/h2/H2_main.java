package h2;

public class H2_main {

	public static void main(String[] args) {
	
		// Variablendeklaration
		
				boolean a,b,c,x,y;
				int input = 0; // beliebiger Startwert für die Variable input: 0, 1, 10 oder 11
				
			    // Zuweisung von x und y abhängig von input
		        x = (input == 10 || input == 11);
		        y = (input == 11 || input == 1 );
		       
		        // Eigenschaften
		        boolean E1 = x;
		        boolean E2 = y;
		        boolean E3 = (x != y); // x ist ungleich y
		        
		        a = E1 && E2;
		        b = E1 || E3;
		        c= !y;				   // laut Wahrheitstabelle vereinfacht
		        System.out.println("x = " + x);
		        System.out.println("y = " + y);
		        System.out.println("a = " +a );
		        System.out.println("b = " +b );
		        System.out.println("c = " +c );
	}
}
