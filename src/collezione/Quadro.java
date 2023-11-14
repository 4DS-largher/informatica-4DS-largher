package collezione;

public class Quadro extends  OperaDarte{
    private double altezza;
    private double larghezza;

    public Quadro(String titolo, String artista, double altezza, double larghezza)throws Exception{
        super(titolo, artista);
        if(altezza<0 || larghezza < 0){
            throw new Exception("Le misure non sono valide");
        }
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }


    public double getLarghezza() {
        return larghezza;
    }

    public double printIngombro(){
        return altezza*larghezza;
    }

    public String toString(){
        return super.toString()+" ALTEZZA: "+altezza+" LARGHEZZA: "+larghezza;
    }
}

