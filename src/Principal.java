import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Senhor dos Anéis: A Sociedade do Anel");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(178);
        meuFilme.setIncluidoNoPlano(true);
        //meuFilme.imprimeFichaTecnica();
        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(10);
        //meuFilme.imprimeAvaliacoes();
        //System.out.println(meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setQuatnidadeTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);


        Filme avatar = new Filme("Avatar");
        avatar.setAnoDeLancamento(2023);
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

        Filme filmeDoLeo = new Filme("Star Wars: Episódio IV – Uma Nova Esperança");
        filmeDoLeo.setDuracaoEmMinutos(121);
        filmeDoLeo.setAnoDeLancamento(1977);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLeo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(avatar);
        System.out.println("A lista tem " + listaDeFilmes.size() + " filmes.");
        System.out.println("O primeiro filme é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}