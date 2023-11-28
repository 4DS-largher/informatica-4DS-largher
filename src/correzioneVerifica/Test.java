package correzioneVerifica;

public class Test {
    public static void main(String[] args) {
        Persona persona = null;
        Prenotazione prenotazione = null;
        Persona perMetodi = null;
        try{
            persona = new Persona("Mario","Rossi","RSSMRC95M16H224T","10/09/2006");
            perMetodi = new Persona("Nicola","Rossi","RSSMRC95M16H224T","10/09/2006");
            prenotazione = new Prenotazione(persona,"17:50:00", "10/20/2023", "nicola.largher@gmail.com");
            System.out.println(prenotazione.toString());
            if(persona.verificaOmonimia(perMetodi)){
                System.out.println("Queste due persone sono omonime!"); //non proprio corretto chiamarle omonime se hanno solo il cognome uguale, forse meglio parenti! ;)
            }else{
                System.out.println("Queste due persone NON sono omonime!");
            }
            System.out.println(perMetodi.calcolaEta());
            System.out.println("Sono state instanziate " + Persona.getNumeroIstanze() + "persone"); //Il contatore di istanze contava una istanza in piu perche quando si isntazia l'oggetto prenotazione nel costruttore copia che viene richiamato veniva istanziata un altra persone per questo ho deciso di rimuovere il counter di istanze nel costruttore copia
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}