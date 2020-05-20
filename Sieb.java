
/**
 * Beschreiben Sie hier die Klasse Sieb.
 * 
 * @author Lukas Breuer
 * @version 18.05.20
 */
public class Sieb
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int zahlen [];

    /**
     * Konstruktor für Objekte der Klasse Sieb
     */
    public Sieb()
    {
        nutzerEingabe();
        fuelle();
        siebe();
        ausgabeAlles();
    }

    public void nutzerEingabe()
    {
        zahlen = new int[EinfachEingabe.getInt("")];
    }

    public void fuelle()
    {
        for (int i = 0; i<=zahlen.length - 1; i++)
        {
            zahlen[i] = i;
        }

    }

    public void ausgabeAlles()
    {   
        int zaehler = 1;
        int stellen = String.valueOf(zahlen.length).length();
        for(int i = 0; i <= stellen; i++)
        {
            System.out.print(" ");
        }
        for (int i = 0; i<=zahlen.length - 1; i++)
        {   

            if(zaehler == 5)
            {
                System.out.println("");
                zaehler = 0;
            }
            if(zahlen[i] != 0)
            {   
                if(stellen <= 5)
                {
                    System.out.print(String.format("%5d", zahlen[i]));
                    System.out.print(";");
                } else {
                    System.out.print(String.format("%"+stellen+"d", zahlen[i]));
                    System.out.print(";");
                }
                zaehler++;
            }
        }
    }

    public void siebe()
    {   
        zahlen[1]= 0;  //eins ist keine Primzahl - Definition
        for (int i = 2; i<zahlen.length - 1; i++) //mit der Variablen i gehen wir von Platz zu Platz, um deren Vielfach zu löschen
        {
            if(zahlen[i] != 0)
            {
                for (int j = 2; j * i < zahlen.length; j++) // j beschreibt, welches Vielfache von i gelöscht werden soll
                {
                    if (zahlen[i] != 0)
                    {
                        zahlen[i*j]= 0;
                    }
                } 
            }

            if(i == Math.sqrt(zahlen.length))
            {   
                System.err.println(i + " " + zahlen[i]);
                System.err.println("Nun wird nicht mehr gezählt");
                return;
            }
        }
    }
}
