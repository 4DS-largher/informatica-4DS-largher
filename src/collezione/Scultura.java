package collezione;

public class Scultura extends OperaDarte{
    private double altezza;
    private double larghezza;
    private double profondita;

    public Scultura(String titolo, String artista, double altezza, double larghezza, double profondita){
        super(titolo, artista);
        this.altezza = altezza;
        this.profondita = profondita;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getProfondita() {
        return profondita;
    }

    public double printIngombro() {
        return altezza*larghezza*profondita;
    }

    public String toString(){
        return super.toString()+" ALTEZZA: "+altezza+" LARGHEZZA: "+ larghezza+" PROFONDITA: "+profondita;
    }
}
