
/**
 * Beschreiben Sie hier die Klasse Aufgaben.
 * 
 * @author Lukas Breuer 
 * @version 07.05.2020
 */
public class Aufgaben {

    int[] zahlen;
    int[] zahlen2;

    public Aufgaben() {
        zahlen = new int[200];
        zahlen2 = new int[200];
    }

    public void fuelle5()

    {

        for (int i = 0; i<=199; i++)

        {

            zahlen[i] = 5;

        }

        zahlen[10] = -1;

    }

    public void fuellealle() {
        for (int i = 0; i < zahlen2.length; i++) {
            zahlen2[i] = i + 1;
            System.out.println(zahlen2[i]);
        }
    }

}
