package correzioneVerifica;


import classiDaImportare.MyException;
import org.apache.commons.validator.routines.EmailValidator;
public class Prenotazione {
    Persona persona;
    String ora;
    String data;
    String email;

    public Prenotazione(Persona persona, String ora, String Data, String email)throws Exception {
        this.persona = new Persona(persona);
        setOra(ora);
        setData(Data);
        setEmail(email);
    }

    public Persona getPersona(){
        Persona temp = null;
        try{
            temp = persona.clone();
        }catch (CloneNotSupportedException e){
            temp = null;
        }
        return null;
    }

    public void setPersona(Persona persona)throws Exception {
        this.persona = new Persona(persona);
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) throws Exception{
        validazioneOra(ora);
        this.ora = ora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception{
        validazioneMail(email);
        this.email = email;
    }

    private void validazioneOra(String ora)throws Exception {
        try {
            if(!ora.matches("(1[0-9]|2[0-4]|0[0-9]):[0-5][0-9]:[0-5][0-9]")){
                throw new MyException("L'orario non è valido!");
            }
        }catch (NullPointerException e){
            throw new NullPointerException("L'orario è null!");
        }catch (MyException e){
            throw new Exception(e.getMessage());
        }catch (Exception e){
            throw new Exception("Errore non previsto!");
        }

    }

    private void validazioneMail(String email)throws Exception{
        if (!EmailValidator.getInstance().isValid(email)) {
            throw new MyException("L'email non è valida!");
        }
    }

    @Override
    public String toString() {
        return "[" + persona.toString() + "," + this.ora + "]";
    }
}