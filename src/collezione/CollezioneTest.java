package collezione;

public class CollezioneTest {
    public static void main(String[] args) {
        try{
            Collezione miaCollezione = new Collezione("Collezione d'Arte", "Mia Casa", 10);

            Quadro quadro1 = new Quadro("Notte stellata", "Vincent van Gogh", 100, 80);
            Scultura scultura1 = new Scultura("David", "Michelangelo", 200, 80, 50);

            miaCollezione.inserisci(quadro1);
            miaCollezione.inserisci(scultura1);

            System.out.println(miaCollezione.stampa());

            // Calcola e stampa l'ingombro di un'opera
            double ingombroQuadro1 = miaCollezione.occupazione(quadro1);
            double ingombroScultura1 = miaCollezione.occupazione(scultura1);

            System.out.println("Ingombro di " + quadro1.getTitolo() + ": " + ingombroQuadro1);
            System.out.println("Ingombro di " + scultura1.getTitolo() + ": " + ingombroScultura1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
