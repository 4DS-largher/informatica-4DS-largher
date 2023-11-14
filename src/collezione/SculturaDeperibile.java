package collezione;

public class SculturaDeperibile extends Scultura {
   private Materiale materiale;
   private int eta; //in giorni

    public SculturaDeperibile(String titolo, String artista, double altezza, double larghezza, double profondita, Materiale materiale, int eta) {
        super(titolo, artista, altezza, larghezza, profondita);
        this.materiale = materiale;
        this.eta = eta;
    }

    @Override
    public double printIngombro() {
        return super.printIngombro() * materiale.getFattoreDeperibilita() * this.eta;
    }

    public String toString(){
        return super.toString() + "NOME MATERIALE : " + materiale.getNome() + "FATTORE DEPERIBILITA: " + materiale.getFattoreDeperibilita();
    }


}
