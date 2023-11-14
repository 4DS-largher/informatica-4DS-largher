package cerchio;

import segmentoPunto.Punto;

import java.util.Scanner;

public class CerchioTest {
    public static void main(String[] args) {
        //dichiarazione variabili
        double deltaX;
        double deltaY;
        //instanza oggetti
        Scanner input = new Scanner(System.in);
        Punto p = new Punto(0,1);
        Cerchio c1 = null;
        try {
            c1 = new Cerchio(p,5);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //System.out.println("L'area del cerchio è: " + c1.calcArea());
        //System.out.println("La circonferenza del cerchio è: " + c1.calcCirconferenza());

        System.out.println("Le coordinate di p sono: " + p.toString());
        System.out.println(c1.toString());

        System.out.print("Inserisci deltaX di p: ");
        deltaX = input.nextDouble();
        System.out.print("Inserisci deltaY di p: ");
        deltaY = input.nextDouble();
        p.traslaPunto(deltaX, deltaY);
        System.out.println("Le coordinate di p sono: " + p.toString());
        System.out.println(c1.toString());



    }
}
