import java.util.Random;

public class Jogo {
    private Time timecasa;
    private Time timefora;
    private int golscasa;
    private int golsfora;
    private boolean criarpartida;


    public Jogo(Time timeCasa, Time timeFora) {
        this.timecasa = timeCasa;
        this.timefora = timeFora;
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


    public void jogar() {
        Random random = new Random();

        this.golscasa = random.nextInt(5);
        this.golsfora = random.nextInt(5);

        if (golscasa > golsfora) {
            timecasa.vencer();
            timefora.perder();
        } else if (golsfora > golscasa) {
            timecasa.perder();
            timefora.vencer();
        } else {
            timecasa.empate();
            timefora.empate();

        }

    }

    @Override
    public String toString() {
        return timecasa.getnomedotime() + " " + golscasa +
                " x " + golsfora + " " +
                timefora.getnomedotime();
    }
}
