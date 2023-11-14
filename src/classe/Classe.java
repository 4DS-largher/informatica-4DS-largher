package classe;

import java.util.Arrays;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti)throws Exception{
        this.capoClasse = new Studente(capoClasse);
        this.studenti = arrayCopia(studenti);
    }

    public Studente getCapoClasse() throws Exception{
        return new Studente(this.capoClasse);
    }

    public void setCapoClasse(Studente capoClasse)throws Exception {
        this.capoClasse = new Studente(capoClasse);
    }

    public Studente[] getStudenti()throws Exception {
        return arrayCopia(this.studenti);
    }

    public void setStudenti(Studente[] studenti)throws Exception {
        this.studenti = arrayCopia(studenti);
    }

    public void invertiAttributi()throws Exception{
        String tmp = capoClasse.getNome();
        capoClasse.setNome(capoClasse.getCognome());
        capoClasse.setCognome(tmp);
        for(int i = 0; i< this.studenti.length; i++){
            tmp = studenti[i].getNome();
            studenti[i].setNome(studenti[i].getCognome());
            studenti[i].setCognome(tmp);
        }

    }

    private Studente[] arrayCopia(Studente[] studenti)throws Exception{
        Studente[] ret = new Studente[studenti.length];
        for(int i = 0; i< studenti.length; i++){
            ret[i] = new Studente(studenti[i]);
        }
        return ret;
    }

    @Override
    public String toString() {
        String ret = "";
        ret += "capoClasse" + capoClasse.toString();
        for(int i = 0; i< studenti.length; i++){
            ret+= studenti[i].toString();
        }
        return ret;

    }
}


