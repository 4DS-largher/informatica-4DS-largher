package correzioneVerifica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import classiDaImportare.MyException;
import studente.Studente;

public class Persona {
    String cognome;

    String nome;
    String codFisc;

    String dataDiNascita;
    protected static int numeroIstanze;


    public Persona() {
        this.numeroIstanze++;
    }

    public Persona(String cognome, String nome, String codFisc, String dataDiNascita) throws Exception{
        setCognome(cognome);
        setNome(nome);
        setCodFisc(codFisc);
        setDataDiNascita(dataDiNascita);
        this.numeroIstanze++;
    }

    public Persona(Persona persona)throws Exception{ //non serve richiamare i set perchè i controlli sono gia stati fatti quando è stato istanziato l'oggetto che viene appunto passato.
        setCognome(persona.cognome);
        setNome(persona.nome);
        setCodFisc(persona.codFisc);
        setDataDiNascita(persona.dataDiNascita);
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) throws Exception{
        controlloNominativi(cognome);//se viene lanciata l'eccezione non va alla istruzione successiva
        this.cognome = cognome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public void setCodFisc(String codFisc)throws Exception {
        controlloCodFisc(codFisc);
        this.codFisc = codFisc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome)throws Exception {
        controlloNominativi(nome);
        this.nome = nome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public Integer calcolaEta() {
        try {
            // Formato della data
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            // Ottieni la data corrente
            Date dataCorrente = new Date();

            // Imposta la data di nascita
            Date dataNascita = sdf.parse(dataDiNascita);

            // Verifica se la data di nascita è nel futuro rispetto alla data corrente
            if (dataNascita.after(dataCorrente)) {
                throw new IllegalStateException("La data di nascita è nel futuro.");
            }

            // Calcola l'età
            Calendar calNascita = Calendar.getInstance();
            Calendar calCorrente = Calendar.getInstance();
            calNascita.setTime(dataNascita);
            calCorrente.setTime(dataCorrente);

            int eta = calCorrente.get(Calendar.YEAR) - calNascita.get(Calendar.YEAR);

            // Verifica se il compleanno è già avvenuto quest'anno
            if (calCorrente.get(Calendar.DAY_OF_YEAR) < calNascita.get(Calendar.DAY_OF_YEAR)) {
                eta--;
            }

            return eta;
        } catch (NullPointerException e){
            throw new NullPointerException("La data di nascita non può essere null!");
        }
        catch (ParseException | IllegalStateException e) {
            // Gestisci l'eccezione restituendo null
            System.out.println("Errore: " + e.getMessage());
            return null;
        }
    }

    public boolean verificaOmonimia(Persona persona){
        return persona.cognome.equals(cognome) && persona.nome.equals(nome);
    }

    private void controlloNominativi(String nominativo)throws Exception{
        boolean flag = true;
        try{
            if((int)nominativo.charAt(0)<65 || (int)nominativo.charAt(0)>90){
                throw new MyException("La lettere iniziale deve essere maiuscola!");
            }else{
                for(int i = 1; i<nominativo.length(); i++){
                    if((int)nominativo.charAt(i)<97 || (int)nominativo.charAt(i)>122){
                        throw new MyException("Le lettere dopo la iniziale devono essere minuscole!");
                    }
                }
            }
        }catch (NullPointerException e){
            throw new NullPointerException("La parola non può essere null");
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("La parola contiene spazi vuoti.");
        }catch (MyException e){
            throw new Exception(e.getMessage());
        }catch (Exception e){
            throw new Exception("Errore non previsto!");
        }

    }

    private void controlloCodFisc(String cF)throws Exception{
        boolean flag = true;
        try{
            cF = cF.trim();
            if(!cF.matches("^[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]$")){
                throw new MyException("Il codice fiscale non è valido!");
            }
        }catch (NullPointerException e){
            throw new NullPointerException("La parola non può essere null");
        }catch (MyException e){
            throw new Exception(e.getMessage());
        }catch (Exception e){
            throw new Exception("Errore non previsto!");
        }

    }

    protected Persona clone() throws CloneNotSupportedException{
        Persona clonedObject = (Persona) super.clone();
        numeroIstanze++;
        return clonedObject;
    }

    @Override
    public String toString() {
        return "[" + this.cognome + "," + this.nome + "," + this.codFisc + "]";
    }
}
