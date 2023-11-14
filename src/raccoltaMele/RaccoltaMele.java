package raccoltaMele;
import dataEOra.Data;
public class RaccoltaMele {
    private GiornataRaccolta[] giornateRaccolta;
    private int nRaccolte;  //dimLogica

    public RaccoltaMele(int nGiorni)throws Exception{
        if(nGiorni<1){
            throw new Exception("I giorni totali di raccolta devono essere maggiori di 0");
        }
        giornateRaccolta = new GiornataRaccolta[nGiorni];
        nRaccolte= 0;
    }


    public void aggiungiGiornata(GiornataRaccolta giornata)throws Exception{
        if(nRaccolte == giornateRaccolta.length){
            raddoppiaArray();
        }
        giornateRaccolta[nRaccolte] = giornata;
        nRaccolte++;
    }

    private void raddoppiaArray(){
        GiornataRaccolta[] arrTmp = new GiornataRaccolta[nRaccolte*2];
        for(int i = 0; i<nRaccolte; i++){
            arrTmp[i] = giornateRaccolta[i];
        }
        giornateRaccolta = arrTmp;
    }

    public double totaleRaccolto(){
        double sum = 0;
        for(int i = 0; i<nRaccolte; i++){
            sum += giornateRaccolta[i].getQuintaliRaccolti();
        }
        return sum;
    }



    public double mediaGiornaliera()throws Exception{
        if(nRaccolte == 0){
            throw new Exception("Non hai inserito giorni di raccolta");
        }
        return totaleRaccolto()/nRaccolte;
    }

    public GiornataRaccolta massimaRaccolta()throws Exception{
        if(nRaccolte == 0){
            throw new Exception("Non hai inserito giorni di raccolta");
        }
        GiornataRaccolta max = giornateRaccolta[0];
        for(int i = 1; i<nRaccolte; i++){
            if(giornateRaccolta[i].getQuintaliRaccolti()>max.getQuintaliRaccolti()){
                max = giornateRaccolta[i];
            }
        }
        return max;
    }


    public void dateSopraSoglia(double soglia, Data[] arr){
        int j = 0;
        for(int i = 0; i<nRaccolte; i++){
            if(giornateRaccolta[i].getQuintaliRaccolti()>soglia){
                arr[j]= giornateRaccolta[i].getData();
                j++;
            }
        }
    }

    public double quintaliInData(Data data)throws Exception{
        if(nRaccolte == 0){
            throw new Exception("Non hai inserito giorni di raccolta");
        }
        int i = 0;
        while(giornateRaccolta[i].getData()!=data && i<nRaccolte){
            i++;
        }
        return giornateRaccolta[i].getQuintaliRaccolti();
    }
}
