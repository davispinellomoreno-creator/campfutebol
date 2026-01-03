import java.util.ArrayList;
import java.util.List;

public class camp {
    private List <time> times = new ArrayList<>();
    private List <jogo> jogos =  new ArrayList<>();;

    public void iniciar() {
        criarJogos();

        for (jogo jogo : jogos) {
            jogo.jogar();
        }
    }

    private void criarJogos() {

    }


}
