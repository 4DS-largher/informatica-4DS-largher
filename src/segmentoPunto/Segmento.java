package segmentoPunto;

public class Segmento {
    private Punto punto1;
    private Punto punto2;

    public Segmento(Punto punto1, Punto punto2) throws Exception{
        if(punto1.getX() == punto2.getX() && punto1.getY() == punto2.getY()){
            throw new Exception("Il segmento risulta nullo!");
        }
        //aggregazione stretta
        this.punto1 = new Punto(punto1);
        this.punto2 = new Punto(punto2);
    }

    public Punto getPunto1(){
        Punto ret = new Punto(punto1);
        return ret;
    }


    public Punto getPunto2(){
        Punto ret = new Punto(punto2);
        return ret;
    }

    public void setPunto1(Punto p1){
        punto1 = new Punto(p1);
    }

    public void setPunto2(Punto p2) {
        punto1 = new Punto(p2);
    }

    public double calcDistanza(){
        return Math.sqrt(Math.pow((punto1.getX()-punto2.getX()), 2) + Math.pow((punto1.getY()-punto2.getY()),2));
    }

    public double coefficienteAngolare(){
        return (punto1.getY() - punto2.getY()) / (punto1.getX() - punto2.getX());
    }


    public void traslaSegmento(double deltaX, double deltaY){
        punto1.traslaPunto(deltaX, deltaY);
        punto2.traslaPunto(deltaX, deltaY);
    }

    public String toString(){
        return "ESTREMO A(" + punto1.getX() + "," + punto1.getY() + ") - ESTREMO B(" + punto2.getX() + "," + punto2.getY() + ")";
    }
}
