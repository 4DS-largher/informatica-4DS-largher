 

import java.util.Scanner;

public class Rombo extends Poligono{
    private float dMin;
    private float dMag;
    public Rombo(float lLati, float dMag, float dMin){
        super(4,lLati);
        this.dMag=dMag;
        this.dMin=dMin;
    }
    public Rombo(Rombo r){
        super(4,r.getLLati());
    }
    public float area(){
        return (dMin*dMag)/2;
    }
    public float apotema(){
        return (area()*2)/super.perimetro();
    }
    public float getDMin(){
        return dMin;
    }
    public float getDMag(){
        return dMag;
    }

    public String disegno(char carattere) {
        Scanner scanner = new Scanner(System.in);
        int n = (int)getLLati();

        String str = "";

        //parte sopra del rombo
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--){
                str += " ";
            }
            str += carattere;
            for (int j = 1; j < (i - 1) * 2; j++){
                str += " ";
            }

            if (i == 1){
                str += "\n";
            }else{
                str += (carattere + "\n");
            }

        }

        // Costruzione della parte inferiore del rombo
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--){
                str += " ";
            }
            str += carattere;
            for (int j = 1; j < (i - 1) * 2; j++){
                str += " ";
            }

            if (i == 1){
                str += "\n";
            }else{
                str += (carattere + "\n");
            }
        }

        return str;
    }

    public String toString() {
        return "Rombo{ " + "\nNumero lati: "+getNLati()+" lunghi: "+getLLati()+ "\ndiagonale maggiore: " + getDMag() + "\ndiagonale minore: " + getDMag() + "}";
    }


}
