package ora;
import java.util.Scanner;


public class OraTest {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);


        int ora;
        int minuti;
        int secondi;
        int totale;
        boolean flag = false;
        Ora orario = null;

        do {
            System.out.print("Inserisci le ore: ");
            ora = input.nextInt();

            System.out.print("Inserisci i minuti: ");
            minuti = input.nextInt();


            System.out.print("Inserisci i secondi: ");
            secondi = input.nextInt();
            try {
                orario = new Ora(secondi, minuti, ora);
                flag = true;
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        } while (flag == false);


        int scelta = 0;

        do {
            System.out.print("\n\n============MENU'============\n©Daniel Franchini & Nicola Largher\n\n1) Premi 1 per calcolare i secondi passati dalla mezzanotte\n2) Premi 2 per calcolare i minuti passati dalla mezzanotte\n3) Premi 3 per calcolare i ore passati dalla mezzanotte\n4) Esci\nScelta: ");
            scelta = input.nextInt();
            switch (scelta) {
                case 1:
                    System.out.print("Ecco i secondi passati dalla mezzanotte: " + orario.SecondFromMidnight());
                    break;
                case 2:
                    System.out.print("Ecco i minuti passati dalla mezzanotte: " + orario.MinuteFromMidnight());
                    break;
                case 3:
                    System.out.print("Ecco le ore passate dalla mezzanotte: " + orario.HourFromMidnight());
                    break;
                case 4:
                    System.out.print("Grazie per aver usato il programma! ;)");
            }
        } while (scelta != 4);


    }
}
