public class time {
    private String nomedotime;
    private int pontos;
    private int vitorias;
    private int empates ;
    private int derrotas;

    public time(String nomedotime,int pontos, int vitorias,int empates,int derrotas) {
        this.nomedotime = nomedotime;
        this.pontos = pontos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;

    }
    public String getnomedotime(){
        return this.nomedotime;
    }
    public int getpontos(){
        return this.pontos;
    }
    public void setnomedotime(String nomedotime){

    }
    public void setpontos(int pontos){

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
