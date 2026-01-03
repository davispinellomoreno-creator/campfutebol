public class jogo {
    private time timecasa;
    private time timefora;
    private int golscasa;
    private int golsfora;

    public jogo(time timecasa, time timefora, int golscasa, int golsfora) {
        this.timecasa = timecasa;
        this.timefora = timefora;
        this.golscasa = golscasa;
        this.golsfora = golsfora;
    }

    public time getTimecasa() {
        return timecasa;
    }

    public void setTimecasa(time timecasa) {
        this.timecasa = timecasa;
    }

    public time getTimefora() {
        return timefora;
    }

    public void setTimefora(time timefora) {
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
    }
}
