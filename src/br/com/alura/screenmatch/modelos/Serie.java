package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int quatnidadeTemporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getQuatnidadeTemporadas() {
        return quatnidadeTemporadas;
    }

    public void setQuatnidadeTemporadas(int quatnidadeTemporadas) {
        this.quatnidadeTemporadas = quatnidadeTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return (quatnidadeTemporadas * episodiosPorTemporada * minutosPorEpisodio);
    }
}
