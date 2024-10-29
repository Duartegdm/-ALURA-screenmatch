public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    boolean incluidoNoPlano;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " +  this.anoDeLancamento);
        System.out.println("Duração em minutos: " +  this.duracaoEmMinutos);
        System.out.println("Incluído no plano: " +  this.incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
