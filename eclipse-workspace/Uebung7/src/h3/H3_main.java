package h3;

public class H3_main {

    public static void main(String[] args) {

        // Objekt Mensch erstellen
        Mensch person = new Mensch();

        // Werte zuweisen
        person.setName("Elsa");
        person.setGebJahr(2010);
        person.setAlter(); // berechnet das Alter automatisch

        
        System.out.println("Name: " + person.getName());
        System.out.println("Geburtsjahr: " + person.getGebJahr());
        System.out.println("Alter: " + person.getAlter());
    }
}

class Mensch {

    // Attribute
    public String name;
    public int gebJahr;
    public int alter;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    public void setAlter() {
        // Alter berechnen basierend auf aktuellem Jahr 2025
        this.alter = 2025 - this.gebJahr;
    }

    
    public String getName() {
        return this.name;
    }

    public int getGebJahr() {
        return this.gebJahr;
    }

    public int getAlter() {
        return this.alter;
    }
}
