package ora;

public class Ora {

    private int secondi;

    public Ora(int secondi,int minuti,int ore) throws Exception{
        if (secondi < 0 || secondi > 59) {
            throw new Exception("Secondi non validi!");
        } else if (minuti < 0 || minuti > 59) {
            throw new Exception("Minuti non validi!");
        } else if (ore < 1 || ore > 24) {
            throw new Exception("Ora non valida!");
        }

        this.secondi = secondi + (minuti*60) + (ore*3600);
    }

    public int getSecondi() {
        return secondi;
    }

    public int SecondFromMidnight() {
        return secondi;
    }

    public int MinuteFromMidnight() {
        return secondi/60;
    }

    public int HourFromMidnight() {
        return secondi/3600;
    }


}
