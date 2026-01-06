import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Time> times = new ArrayList<>();


        times.add(new Time("Flamengo", 0, 0, 0, 0));
        times.add(new Time("Fluminense", 0, 0, 0, 0));
        times.add(new Time("Palmeiras", 0, 0, 0, 0));
        times.add(new Time("Corinthians", 0, 0, 0, 0));

        System.out.println("Times participantes da Supercopa Brasileira:");
        for (Time time : times) {
            System.out.println(time);
        }

        System.out.println("\nIniciando campeonato...\n");

        Camp.setTimes(times);


        Camp.iniciar();

        System.out.println("\nCampeonato finalizado.");
    }
}
