import java.util.ArrayList;
import java.util.List;

public class Camp {
    private List <Time> times = new ArrayList<>();
    private List <Jogo> jogos =  new ArrayList<>();;

    public void iniciar() {
        criarJogos();

        for (Jogo jogo : jogos) {
            jogo.jogar();
        }
    }

    private void criarJogos(Time timecasa, Time timefora) {

    }


}
