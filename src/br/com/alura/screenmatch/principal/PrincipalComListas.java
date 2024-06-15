package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        buscaPorArtista.add("Leonardo");

        System.out.println("Lista não ordenada");
        System.out.println(buscaPorArtista + "\n");

        System.out.println("Lista ordenada");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista + "\n");

        System.out.println("Lista de filemes ordenada por nomes");
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos + "\n");

        System.out.println("Lista de filmes ordenada por ano de lançamento");
        listaTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaTitulos + "\n");
    }
}
