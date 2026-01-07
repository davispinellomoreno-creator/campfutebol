import java.util.ArrayList;
import java.util.List;

public class Camp {

    private static List<Time> times = new ArrayList<>();
    private static List<Jogo> jogos = new ArrayList<>();

    public static void setTimes(List<Time> listaTimes) {
        times = listaTimes;
    }

    public static void iniciar() {
        criarJogos();

        System.out.println("Jogos do campeonato:\n");

        for (Jogo jogo : jogos) {
            jogo.jogar();
            System.out.println(jogo);
        }

        System.out.println("\nClassificação final:\n");
        for (Time time : times) {
            System.out.println(time);
        }
    }

    private static void criarJogos() {
        for (int i = 0; i < times.size(); i++) {
            for (int j = i + 1; j < times.size(); j++) {
                jogos.add(new Jogo(times.get(i), times.get(j)));
            }
        }
    }
    public static void mostrarTabela (){
        System.out.println("------------TABELA DA SUPERCOPA BRASILEIRA");
        System.out.println("Primeiro lugar"  );
    }
}





