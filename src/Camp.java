
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

        times.sort((time1, time2) -> {

            // 1º critério: pontos
            if (time2.getpontos() != time1.getpontos()) {
                return time2.getpontos() - time1.getpontos();
            }

            // 2º critério: vitórias
            return time2.getVitorias() - time1.getVitorias();
        });

        System.out.println("=================TABELA====================");
       int posicao = 1;
       for(Time time : times){
           System.out.println(posicao + "º lugar - " + time.getnomedotime() +
                   "Vitorias :" + time.getVitorias() +
                    "Empates :" + time.getEmpates() +
                    "derrotas:" + time.getDerrotas()) ;

           posicao++;
       }

}
}






