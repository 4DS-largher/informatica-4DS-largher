package puntoEreditarieta;

public class PuntoColorato extends PuntoEre {
    private String colore;

    public PuntoColorato(double x, double y, String colore) {
        super(x, y);
        this.colore = colore;
    }

    public String getColore(){
        return colore;
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public PuntoColorato(PuntoColorato p){
        super(p.getX(),p.getY());
        this.colore=p.colore;
    }

    public String toString(){
        return (String)super.toString() + " è di colore: " + colore;
    }
}
