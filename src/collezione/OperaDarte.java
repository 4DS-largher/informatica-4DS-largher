package collezione;

public abstract class OperaDarte {
    protected String titolo;
    protected String artista;

    public OperaDarte(String titolo, String artista){
        this.titolo = titolo;
        this.artista = artista;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public abstract double printIngombro();

    public boolean equals(OperaDarte o){
        return o.getArtista().equals(artista) && o.getTitolo().equals(titolo) && o.printIngombro() == printIngombro();
    }

    public String toString(){
        return "ARTISTA: "+artista+" TITOLO: "+titolo;
    }
}