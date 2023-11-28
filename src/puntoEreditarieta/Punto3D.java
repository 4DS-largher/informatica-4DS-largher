 

public class Punto3D extends PuntoEre {
    private double z;

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void traslaPunto(float deltaX, float deltaY, float deltaZ){
        super.traslaPunto(deltaX,deltaY);
        z += deltaZ;
    }

    public String toString(){
        String punto="("+getX()+","+getY()+","+z+")";
        return punto;
    }

    public Punto3D(Punto3D p) {
        super(p.getX(),p.getY());
        this.z = p.z;
    }
}
