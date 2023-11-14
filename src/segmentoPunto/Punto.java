package segmentoPunto;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    //costruttore copia

    public Punto(Punto p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void traslaPunto(double deltaX, double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
