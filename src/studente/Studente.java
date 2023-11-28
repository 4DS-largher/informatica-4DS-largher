package studente;

import classiDaImportare.MyException;
import correzioneVerifica.Persona;
import java.util.Objects;

public class Studente extends Persona implements Cloneable {

    public Studente() {
    }

    public Studente(String cognome, String nome, String codFisc, String dataDiNascita) throws Exception {
        super(cognome, nome, codFisc, dataDiNascita);
    }

    protected Studente clone() throws CloneNotSupportedException{
        Studente clonedObject = (Studente) super.clone();
        numeroIstanze++;
        return clonedObject;
    }

    public boolean equals (Object stud) {
        boolean ret = false;
        if(stud instanceof Studente){
            if((getNome().equals(((Studente) stud).getNome())&&getCodFisc().equals(((Studente) stud).getCodFisc()) && getCognome().equals(((Studente) stud).getCognome()) && getDataDiNascita().equals(((Studente) stud).getDataDiNascita()))){
                ret = true;
            }
        }
        return ret;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        try{
            numeroIstanze--;
        } finally {
            super.finalize();
        }
    }

    public String toString(){
        return super.toString();
    }

}

