package segmentoPunto;

import java.util.Scanner;

public class segPoiTest {
    public static void main(String[] args) {
        //dichiarazione variabili
        double deltaX;
        double deltaY;

        //istanza oggetti
        Scanner input = new Scanner(System.in);
        Punto p1 = new Punto(2,3);
        Punto p2 = new Punto(2,3);
        Segmento sg1 = null;
        try{
            sg1 = new Segmento(p1,p2);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }



        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.println("La distanza tra i due estremi è: " + sg1.calcDistanza());
        System.out.println("Il coefficiente angolare del segmento è: " + sg1.coefficienteAngolare());
        System.out.print("Inserisci deltaX: ");
        deltaX = input.nextDouble();
        System.out.print("Inserisci deltaY: ");
        deltaY = input.nextDouble();
        sg1.traslaSegmento(deltaX, deltaY);
        System.out.println(sg1.toString());
        System.out.println("Il punto ha coordinate P" + p1.toString());
        System.out.println("Il punto ha coordinate P" + p2.toString());
    }
}
