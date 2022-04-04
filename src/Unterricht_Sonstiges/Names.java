package Unterricht_Sonstiges;

public class Names {

    public static void main(String[] args) {

	String firstName = "Elisabeth";
	String lastName = "Unger";
        //ohne Methode
        System.out.println("The full name is " + firstName + " " + lastName + ".");

        //mit Methode
        System.out.println("Method: " + makeFullName(firstName, lastName));
        //oder direkt Strings übergeben
        System.out.println("Method: " + makeFullName("Grace", "Hopper"));
    }
    //main methoden kommen hier hin!!
    public static String makeFullName (String firstName, String lastName) {
        return "The full name is " + firstName + " " + lastName + ".";
    }
}
