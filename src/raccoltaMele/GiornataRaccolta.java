package raccoltaMele;
import dataEOra.Data;

public class GiornataRaccolta {
    private Data data;
    private double quintaliRaccolti;

    public GiornataRaccolta(Data data, double quintaliRaccolti) throws Exception{
        if(quintaliRaccolti<0){
            throw new Exception("I quintali non possono essere negativi");
        }
        this.data = data;
        this.quintaliRaccolti = quintaliRaccolti;
    }

    public double getQuintaliRaccolti(){
        return quintaliRaccolti;
    }

    public Data getData(){
        return data;
    }

    @Override
    public String toString() {
        return "GiornataRaccolta{" +
                "data=" + data.toString() +
                ", quintaliRaccolti=" + quintaliRaccolti +
                '}';
    }
}
