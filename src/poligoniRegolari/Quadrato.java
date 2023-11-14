package poligoniRegolari;
import java.lang.Math;

public class Quadrato extends Poligono {

    public Quadrato(float lLati){
        super(4,lLati);
    }

    public Quadrato(Quadrato q){
        super(4,q.getLLati());
    }

    public float area(){
        return (float) Math.pow(getLLati(),2);
    }

    public float diagonale(){
        float i=getLLati();
        return (float) Math.sqrt(Math.pow(getLLati(),2)*2);
    }

    public float apotema(){
        return getLLati()/2;
    }

    public String disegno(char x) {
        String s = "";
        int lLati = (int) this.getLLati();

        for (int i = 0; i < lLati; i++) {
            if (i == 0 || i == lLati - 1) {
                for (int j = 0; j < lLati; j++) {
                    s += x;
                }
                s += "\n";
            } else {
                s += x;
                for (int j = 1; j < lLati - 1; j++) {
                    s += " ";
                }
                s += x + "\n";
            }
        }

        return s;
    }

    @Override
    public String toString() {
        return "Quadrato{ " + "\nNumero lati: "+getNLati()+" lunghi: "+getLLati()+ "}";
    }
}
