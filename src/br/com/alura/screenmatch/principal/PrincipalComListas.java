package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Senhor dos Anéis: A Sociedade do Anel", 2001);
        meuFilme.avaliarFilme(9);
        Serie lost = new Serie("Lost", 2000);
        Filme avatar = new Filme("Avatar", 2023);
        avatar.avaliarFilme(8);
        Filme filmeDoLeo = new Filme("Star Wars: Episódio IV – Uma Nova Esperança", 1977);
        filmeDoLeo.avaliarFilme(10);

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(filmeDoLeo);
        listaTitulos.add(meuFilme);
        listaTitulos.add(avatar);
        listaTitulos.add(lost);

        for (Titulo item: listaTitulos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}
