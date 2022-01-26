import java.util.*;  
public class DetectUserInput 
{
    public static void main(String[] args) 
    {
        // Scanner-Objekt erstellen. System.in ist ein Standard Input-Stream.
        Scanner sc = new Scanner(System.in);

        // Anweisung für Nutzer
        System.out.println("\n-> Bitte gebe eine positive oder negative Zahl ein:\n");

        // Nutzereingabe auslesen.
        int zahl = sc.nextInt();

        // Wenn eingegebene Zahl kleiner 0, also negativ, dann negativ ausgeben, sonst positiv.
        if (zahl < 0) 
        {
            // Ergebnis zeigen.
            System.out.println("\n-> Du hast eine negative Zahl eingegeben.\n");
        }
        else 
        {
            // Ergebnis zeigen.
            System.out.println("\n-> Du hast eine positive Zahl eingegeben.\n");
        }
    } 
}