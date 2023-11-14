package collezione;

import java.util.Arrays;

public class Collezione {
    private String nome;
    private String luogo;
    private int dimLog;

    private OperaDarte[] opere;

    public Collezione(String nome, String luogo, int numOpere)throws Exception{
        setNome(nome);
        setLuogo(luogo);
        this.dimLog = 0;
        opere = new OperaDarte[numOpere];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public int getDimLog() {
        return dimLog;
    }

    public OperaDarte getOpera(int pos){
        return opere[pos];
    }

    public void inserisci(OperaDarte o)throws Exception{
        checkArrayFull();
        opere[dimLog] = o;
        this.dimLog++;
    }
    public String stampa(){
        String collezione="_____COLLEZIONE_____\n";
        collezione +="nome: " + nome + " luogo: " + luogo+"\n";
        for(int i=0; i<dimLog; i++){
            collezione += i+". "+opere[i].toString() + "\n";
        }
        return collezione;
    }

    public double occupazione(OperaDarte o)throws Exception{
        checkArrayEmpty();
        double ret = -1;
        for(int i = 0; i<dimLog; i++){
            if(opere[i].equals(o)){
                ret = opere[i].printIngombro();
            }
        }
        if(ret == -1){
            throw new Exception("La collezione non contiene l'opera ricercata!");
        }
        return ret;
    }

    private void checkArrayEmpty()throws Exception{
        if(dimLog == 0){
            throw new Exception("La collezione non ha nessun elemento all'interno!");
        }
    }

    private void checkArrayFull()throws Exception{
        if(opere.length == dimLog){
            throw new Exception("La collezione è piena e non accetta l'inserimento di nuove opere!");
        }
    }

    @Override
    public String toString(){
        return "Collezione{" +
                "nome='" + nome + '\'' +
                ", luogo='" + luogo + '\'' +
                ", dimLog=" + dimLog +
                ", opere=" + stampa() +
                '}';
    }
}
