package poligoniRegolari;

public class Esagono extends Poligono{
    public Esagono(float lLati){
        super(6, lLati);
    }
    public Esagono(Esagono e){
        super(6, e.getLLati());
    }
    public float diagonale(){
        return getLLati();
    }
    public float area(){
        return(super.perimetro()*apotema())/2;
    }
    public float apotema(){
        return (float) (0.86*getLLati());
    }

    public String disegno(char carattere) {
        String risultato = "";
        return risultato;
    }

    public String toString() {
        return "Esagono{ " + "\nNumero lati: "+getNLati()+" lunghi: "+getLLati()+ "}";
    }
}
