package poligoniRegolari;

public class GestionePoligoni {
    private Poligono[] arrPoligoni;
    private int dimLogica;

    public GestionePoligoni(int lunghezza){
        arrPoligoni = new Poligono[lunghezza];
        dimLogica = 0;
    }

    public void inserisciPoligono(Poligono pol){
        arrPoligoni[dimLogica] = pol;
        dimLogica++;
    }

    public Poligono poligonoConLatoPiuLungo() {
        Poligono max = arrPoligoni[0];
        for (int i = 1; i < dimLogica; i++) {
            if (arrPoligoni[i].getLLati() > max.getLLati()) {
                max = arrPoligoni[i];
            }
        }
        return max;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < dimLogica; i++) {
            s += arrPoligoni[i].toString();
        }
        return s;
    }
}
