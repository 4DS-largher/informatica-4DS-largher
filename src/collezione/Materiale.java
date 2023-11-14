package collezione;

public class Materiale {
    private double fattoreDeperibilita;
    private String nome;

    public Materiale(double fattoreDeperibilita, String nome) {
        this.fattoreDeperibilita = fattoreDeperibilita;
        this.nome = nome;
    }

    public double getFattoreDeperibilita() {
        return fattoreDeperibilita;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Materiale{" +
                "fattoreDeperibilita=" + fattoreDeperibilita +
                ", nome='" + nome + '\'' +
                '}';
    }
}
