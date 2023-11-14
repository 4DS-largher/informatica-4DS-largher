import classe.Classe;
import classe.Studente;

public class ClasseTest {
    public static void main(String[] args) {
        Studente capoClasse = null;
        Classe classe = null;
        try {
            capoClasse = new Studente("Rossi", "Mario");
            Studente[] studenti = {
                    new Studente("Bianchi", "Luca"),
                    new Studente("Verdi", "Anna"),
                    new Studente("Neri", "Giovanni")
            };

            classe = new Classe(capoClasse, studenti);

            System.out.println("Dati originali:");
            System.out.println(classe.toString());

            classe.invertiAttributi();

            System.out.println("\nDati dopo l'inversione:");
            System.out.println(classe.toString());
        }catch (Exception e){
            System.out.println("Errore: " + e.getMessage());
        }
    }
}