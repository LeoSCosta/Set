package one.digitalInnovation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Dada as seguintes informações sobre as minhas séries favoritas.
Crie um conjuto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio)

Série 1 = Nome: got, genero: fatasia, tempoEpisodio: 60
Série 2 = Nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = Nome: that '70s show, genero: Comédia, tempoEpisodio: 25
 */
public class Main {
    public static void main(String[] args) {

        Set<Serie> lista = new HashSet<>();
        lista.add(new Serie("got","fantasia",60));
        lista.add(new Serie("dark","drama",60));
        lista.add(new Serie("that","comedia",25));

        System.out.println("Ordem aleatória");
        System.out.println(lista);

        System.out.println("Ordem de inserção");
        Set<Serie> aux = new LinkedHashSet<>();
        aux.add(new Serie("got","fantasia",60));
        aux.add(new Serie("dark","drama",60));
        aux.add(new Serie("that","comedia",60));
        System.out.println(aux);

        System.out.println("\nOrdem natural(Tempo de episódio)");
        Set<Serie> arvore = new TreeSet<>(lista);
        System.out.println(arvore);

        System.out.println("\nOrdem alfabética");
        Set<Serie> arvore2 = new TreeSet<>(new ComparatorSerie());
        arvore2.addAll(lista);
        System.out.println(arvore2);







    }
}
