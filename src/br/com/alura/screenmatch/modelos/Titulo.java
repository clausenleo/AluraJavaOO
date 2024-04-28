package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaNotasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void imprimeFichaTecnica () {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void imprimeAvaliacoes() {
        System.out.println("Nota do filme: " + pegaMediaAvaliacoes());
    }

    private double pegaMediaAvaliacoes(){
        return (somaNotasAvaliacoes / totalDeAvaliacoes);
    }

    public void avaliarFilme (double notaAvaliacao){
        somaNotasAvaliacoes += notaAvaliacao;
        totalDeAvaliacoes++;
    }
    public int getTotalDeAvaliacoes () {
        return totalDeAvaliacoes;
    }

}
