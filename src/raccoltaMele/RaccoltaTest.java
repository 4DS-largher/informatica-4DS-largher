package raccoltaMele;

import dataEOra.Data;

public class RaccoltaTest {
    public static void main(String[] args) {
        RaccoltaMele r1 = null;
        Data d1 = null;
        GiornataRaccolta g1 = null;
        double media;
        GiornataRaccolta massima = null;

        int g, m , a;
        g = 19;
        m = 9;
        a = 2023;

        try{
            r1 = new RaccoltaMele(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        for(int i = 0; i < 4; i++){
            try{
                d1 = new Data(a,m,g);
                g1 = new GiornataRaccolta(d1,100);
                r1.aggiungiGiornata(g1);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            g++;
        }

        System.out.println("Totale raccolto = " + r1.totaleRaccolto());

        try{
            media = r1.mediaGiornaliera();
            System.out.println("La media è = " + media);
            massima = r1.massimaRaccolta();
            System.out.println("La raccolta massima è stata: " + massima.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
