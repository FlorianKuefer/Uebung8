package h3;

public class H3_main {

	public static void main(String[] args) {

		// Variante mit float
		
        float celsiusFloat = 14.2f; // Beispielwert 
        float fahrenheitFloat = celsiusFloat * 9 / 5 + 32;
        
        System.out.println("Float-Konvertierung:");
        System.out.println(celsiusFloat + "°C = " + fahrenheitFloat + "°F");
      
        // Variante mit double
        double celsiusDouble = 14.2; // Beispielwert
        double fahrenheitDouble = (celsiusDouble * 9 / 5) + 32;
        System.out.println("Double-Konvertierung:");
        System.out.println(celsiusDouble + "°C = " + fahrenheitDouble + "°F");
        
	}

}
