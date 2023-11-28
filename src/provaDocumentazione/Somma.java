package provaDocumentazione;

/**
 * La classe Somma rappresenta un oggetto che effettua l'operazione di somma
 * su due numeri interi.
 */
public class Somma {

    /**
     * Questo metodo restituisce la somma di due numeri interi.
     *
     * @param a Il primo numero intero.
     * @param b Il secondo numero intero.
     * @return La somma di a e b.
     */
    public int eseguiSomma(int a, int b) {
        return a + b;
    }

    /**
     * Metodo di esempio per illustrare come lanciare un'eccezione in caso di somma overflow.
     *
     * @param a Il primo numero intero.
     * @param b Il secondo numero intero.
     * @return La somma di a e b.
     * @throws ArithmeticException Se si verifica un overflow durante la somma.
     */
    public int eseguiSommaConOverflowCheck(int a, int b) throws ArithmeticException {
        // Verifica se la somma provoca un overflow
        if ((b > 0 && a > Integer.MAX_VALUE - b) || (b < 0 && a < Integer.MIN_VALUE - b)) {
            throw new ArithmeticException("Overflow durante la somma");
        }
        return a + b;
    }

    /**
     * Metodo di esempio per illustrare come gestire il caso di somma con gestione di overflow.
     *
     * @param a Il primo numero intero.
     * @param b Il secondo numero intero.
     * @return La somma di a e b, o Integer.MAX_VALUE se si verifica un overflow positivo,
     *         o Integer.MIN_VALUE se si verifica un overflow negativo.
     */
    public int eseguiSommaConOverflowHandling(int a, int b) {
        try {
            return Math.addExact(a, b);
        } catch (ArithmeticException e) {
            // Overflow gestito restituendo il valore massimo o minimo consentito
            return (b > 0) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }

    /**
     * Metodo principale di esempio per testare la classe Somma.
     *
     * @param args Argomenti della riga di comando (non utilizzati in questo esempio).
     */
    public static void main(String[] args) {
        Somma sommatore = new Somma();
        int risultato = sommatore.eseguiSomma(5, 3);
        System.out.println("Risultato della somma: " + risultato);
    }
}

