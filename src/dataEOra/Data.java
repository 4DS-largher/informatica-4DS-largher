package dataEOra;

public class Data {
    private int anno;
    private int mese;
    private int giorno;

    public Data(int anno, int mese, int giorno)throws Exception{
        try{
            dataValida(anno,mese,giorno);
            this.anno = anno;
            this.mese = mese;
            this.giorno = giorno;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public void dataValida(int anno, int mese, int giorno)throws Exception {
        boolean valida = true;
        if (anno < 1 || mese < 1 || mese > 12 || giorno < 1)
            throw new Exception("Mese o giorno non validi");
        int[] giorniPerMese = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (bisestile(anno)){
            giorniPerMese[2] = 29;
        }
        if (giorno > giorniPerMese[mese]){
            throw new Exception("I giorni non corrispondono al mese");
        }
    }

    private boolean bisestile(int anno){
        boolean bisestile = false;
        if(anno%400 == 0 || anno%4 == 0 && anno%100 != 0){
            bisestile=true;
        }
        return bisestile;
    }

    @Override
    public String toString() {
        return "Data{" +
                "anno=" + anno +
                ", mese=" + mese +
                ", giorno=" + giorno +
                '}';
    }
}
