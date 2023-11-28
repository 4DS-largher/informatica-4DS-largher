package studente;

import classiDaImportare.MyException;

public class StudenteTest {

    public static void main(String[] args) {
        try {
            // Creazione di due oggetti Studente per il test
            Studente studente1 = new Studente("Rossi", "Marco", "RSSMRC95M16H224T", "12/12/1912");

            Studente studente2 = new Studente("Rossi", "Marco", "RSSMRC95M16H224T", "12/12/1912");

            // Stampa delle informazioni sugli studenti
            System.out.println("Studente 1: " + studente1);
            System.out.println("Studente 2: " + studente2);

            // Confronto tra gli studenti
            if (studente1.equals(studente2)) {
                System.out.println("Gli studenti sono uguali.");
            } else {
                System.out.println("Gli studenti sono diversi.");
            }

            System.out.println("HASH CODE: " + studente1.hashCode());
            System.out.println("HASH CODE: " + studente2.hashCode());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}