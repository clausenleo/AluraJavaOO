import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Senhor dos Anéis: A Sociedade do Anel", 2001);
        meuFilme.setDuracaoEmMinutos(178);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(10);

        Serie lost = new Serie("Lost", 2000);
        lost.setQuatnidadeTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);


        Filme avatar = new Filme("Avatar", 2023);
        avatar.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiTituloNoTotal(meuFilme);
        calculadora.incluiTituloNoTotal(avatar);
        calculadora.incluiTituloNoTotal(lost);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(99);

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Filme filmeDoLeo = new Filme("Star Wars: Episódio IV – Uma Nova Esperança", 1977);
        filmeDoLeo.setDuracaoEmMinutos(121);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLeo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(avatar);
        System.out.println("A lista tem " + listaDeFilmes.size() + " filmes.");
        System.out.println("O primeiro filme é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}