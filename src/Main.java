import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Time> times = new ArrayList<>();


        times.add(new Time("Flamengo", 0, 0, 0, 0));
        times.add(new Time("Fluminense", 0, 0, 0, 0));
        times.add(new Time("Palmeiras", 0, 0, 0, 0));
        times.add(new Time("Corinthians", 0, 0, 0, 0));
        times.add(new Time("Vitória", 0, 0, 0, 0));
        times.add(new Time("Bahia", 0, 0, 0, 0));
        times.add(new Time("Remo", 0, 0, 0, 0));
        times.add(new Time("Chapecoense", 0, 0, 0, 0));
        times.add(new Time("Mirassol", 0, 0, 0, 0));
        times.add(new Time("Cruzeiro", 0, 0, 0, 0));
        times.add(new Time("São Paulo", 0, 0, 0, 0));
        times.add(new Time("Santos", 0, 0, 0, 0));
        times.add(new Time("Atlético MG", 0, 0, 0, 0));
        times.add(new Time("Coritiba", 0, 0, 0, 0));
        times.add(new Time("Athletico PR", 0, 0, 0, 0));
        times.add(new Time("Botafogo", 0, 0, 0, 0));
        times.add(new Time("Vasco da Gama", 0, 0, 0, 0));
        times.add(new Time("Grêmio", 0, 0, 0, 0));
        times.add(new Time("Athletico PR", 0, 0, 0, 0));
        times.add(new Time("Bragantino", 0, 0, 0, 0));
        times.add(new Time("Internacional", 0, 0, 0, 0));
        times.add(new Time("Coritiba", 0, 0, 0, 0));
        times.add(new Time("Athletico PR", 0, 0, 0, 0));
        times.add(new Time("Botafogo", 0, 0, 0, 0));


        System.out.println("Times participantes da Supercopa Brasileira:");
        for (Time time : times) {
            System.out.println(time);
        }

        System.out.println("\nIniciando campeonato...\n");

        Camp.setTimes(times);


        Camp.iniciar();

        Camp.mostrarTabela();

        System.out.println("\nCampeonato finalizado.");
    }
}
