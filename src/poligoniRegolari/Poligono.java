 

abstract  public class Poligono {
    private int nLati;
    private float lLati;
    public Poligono(int nLati, float lLati){
        this.nLati=nLati;
        this.lLati=lLati;
    }

    public Poligono(Poligono p){
        nLati=p.nLati;
        lLati=p.lLati;
    }

    public int getNLati(){
        return nLati;
    }

    public void setNLati(int nLati){
        this.nLati=nLati;
    }

    public float getLLati(){
        return lLati;
    }

    public void setLLati(float lLati){
        this.lLati=lLati;
    }

    public float perimetro(){
        return nLati*lLati;
    }

    public String toString(){
        return "Numero lati: "+nLati+" lunghi: "+lLati;
    }

    public abstract String disegno(char carattere);

    public abstract float area();
}
