package classe;


import java.lang.String;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String nome, String cognome) throws Exception{
        setNome(nome);
        setCognome(cognome);
    }

    public Studente(Studente s) throws Exception{
        this.nome = s.nome;
        this.cognome = s.cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }


    private boolean controllo(){
        return true;
    }

    public void setNome(String nome) throws Exception{
        //char[] nomeArray = nome.toCharArray();
        if(nome == null){
            throw new NullPointerException("Stringa vuota!");
        }
        if(nome.contains(" ")){
            throw new Exception("Spazi Proibiti!");
        }
        if(nome.length() <= 3){
            throw new Exception("Troppo corto!");
        }

        this.nome = "";

        if(nome.matches("[a-zA-Z]*")){
            this.nome = nome.toLowerCase();
            this.nome = this.nome.substring(0,1).toUpperCase() + this.nome.substring(1);
        }else{
            throw new Exception("Nome errato!");
        }
    }

    public void setCognome(String cognome) throws Exception{
        if(cognome == null){
            throw new NullPointerException("Stringa vuota!");
        }
        if(cognome.equals(" ")){
            throw new Exception("Stringa vuota!");
        }
        if(cognome.length() <= 3){
            throw new Exception("Stringa troppo corta!");
        }

        this.cognome = "";
        try {
            String[] cog = cognome.split(" ");
            if (cog.length == 0) {
                throw new Exception("Stringa vuota!");
            }
            for (int i = 0; i < cog.length; i++) {
                if (cog[i].matches("[A-Z a-z]*")) { //espressioni regolari
                    cog[i] = cog[i].toLowerCase();
                    this.cognome += cog[i].substring(0, 1).toUpperCase() + cog[i].substring(1) + " ";
                } else {
                    throw new Exception("Cognome errato!");
                }
            }
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Stringa errata!");
        }catch (Exception e){
            throw new Exception(" " + e.getMessage());
        }

    }


    public String toString() {
        return "Studente: \n" + nome + "\n" + cognome;
    }
}

