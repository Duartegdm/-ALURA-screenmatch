import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Filme outroFilme = new Filme();
        Serie lost = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        outroFilme.setNome("Avatar 2");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar Lost: " + lost.getDuracaoEmMinutos());

        calculadora.incluiNaLista(outroFilme);
        calculadora.incluiNaLista(meuFilme);
        System.out.println("Tempo para maratonar os filmes na lista: " + calculadora.getTempoDeMaratona());

        filtro.filtra(meuFilme);
    }
}
