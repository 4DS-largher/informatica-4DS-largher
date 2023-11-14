package poligoniRegolari;

public class GestionePoligoniTest {
    public static void main(String[] args) {
        Quadrato q1 = new Quadrato(6);
        Rombo r1 = new Rombo(7,8,8);

        GestionePoligoni gp1 = new GestionePoligoni(2);

        gp1.inserisciPoligono(q1);
        gp1.inserisciPoligono(r1);

        System.out.println(q1.disegno('*'));
        System.out.println(r1.disegno('x'));

        System.out.println(q1.toString());
        System.out.println(r1.toString());


    }
}
