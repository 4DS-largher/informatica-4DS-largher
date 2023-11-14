package cerchio;
import segmentoPunto.Punto;

public class Cerchio {
    private Punto centro;
    private double raggio;

    public Cerchio(Punto centro, double raggio)throws Exception{
        if(raggio<0){
            throw new Exception("Il raggio non può essere negativo!");
        }
        this.centro = new Punto(centro);
        this.raggio = raggio;
    }

    public Punto getCentro() {
        Punto ret = new Punto(centro);
        return ret;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setCentro(Punto centro){
        this.centro = new Punto(centro);
    }

    public void setRaggio(double raggio){
        this.raggio = raggio;
    }

    public void sposta(double deltaX, double deltaY) {
        centro.traslaPunto(deltaX, deltaY);
    }

    public void scala(double percentuale) {
        if (percentuale > 0) {
            raggio *= (1 + percentuale / 100);
        } else if (percentuale < 0) {
            raggio /= (1 - percentuale / 100);
        }
    }

    public double calcArea(){
        return Math.pow(raggio, 2) * Math.PI;
    }

    public double calcCirconferenza(){
        return 2 * Math.PI * raggio;
    }

    @Override
    public String toString() {
        return "C" + centro.toString() + "e raggio: " + raggio;
    }
}
