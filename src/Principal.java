import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Senhor dos Anéis: A Sociedade do Anel");
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
        lost.imprimeFichaTecnica();
        lost.setQuatnidadeTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);


        Filme avatar = new Filme();
        avatar.setNome("Avatar");
        avatar.setAnoDeLancamento(2023);
        avatar.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluiTituloNoTotal(meuFilme);
        calculadora.incluiTituloNoTotal(avatar);
        calculadora.incluiTituloNoTotal(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}