import java.util.Random;

public class Jogo {
    private Time timecasa;
    private Time timefora;
    private int golscasa;
    private int golsfora;

    public Jogo(Time timecasa, Time timefora, int golscasa, int golsfora) {
        this.timecasa = timecasa;
        this.timefora = timefora;
        this.golscasa = golscasa;
        this.golsfora = golsfora;
    }

    public Time getTimecasa() {
        return timecasa;
    }

    public void setTimecasa(Time timecasa) {
        this.timecasa = timecasa;
    }

    public Time getTimefora() {
        return timefora;
    }

    public void setTimefora(Time timefora) {
        this.timefora = timefora;
    }

    public int getGolscasa() {
        return golscasa;
    }

    public void setGolscasa(int golscasa) {
        this.golscasa = golscasa;
    }

    public int getGolsfora() {
        return golsfora;
    }

    public void setGolsfora(int golsfora) {
        this.golsfora = golsfora;
    }

    public void jogar() {
        Random random = new Random();

        int golscasa = random.nextInt(5);
        int golsfora = random.nextInt(5);

        if (golscasa > golsfora){
            timecasa.vencer();
            timefora.perder();
        }
       else if(golsfora > golscasa){
            timecasa.perder();
            timefora.vencer();
        }
       else{
           timecasa.empate();
           timefora.empate();

        }

    }
}
