 

public class PuntoTest {
    public static void main(String[] args) {
        // Creazione di un oggetto PuntoEre
        PuntoEre punto1 = new PuntoEre(1.0, 2.0);
        System.out.println("Punto1: " + punto1);

        // Creazione di un oggetto PuntoColorato
        PuntoColorato puntoColorato = new PuntoColorato(3.0, 4.0, "Rosso");
        System.out.println("PuntoColorato: " + puntoColorato);

        // Copia di PuntoColorato in un nuovo oggetto
        PuntoColorato puntoCopia = new PuntoColorato(puntoColorato);
        System.out.println("Copia di PuntoColorato: " + puntoCopia);

        // Modifica del colore del PuntoColorato
        puntoCopia.setColore("Blu");
        System.out.println("PuntoCopia con colore modificato: " + puntoCopia);

        // Creazione di un oggetto Punto3D
        Punto3D punto3D = new Punto3D(5.0, 6.0, 7.0);
        System.out.println("Punto3D: " + punto3D);

        // Copia di Punto3D in un nuovo oggetto
        Punto3D punto3DCopia = new Punto3D(punto3D);
        System.out.println("Copia di Punto3D: " + punto3DCopia);

        // Traslazione di Punto3D
        punto3DCopia.traslaPunto(1.0f, 1.0f, 1.0f);
        System.out.println("Punto3DCopia dopo traslazione: " + punto3DCopia);
    }
}
