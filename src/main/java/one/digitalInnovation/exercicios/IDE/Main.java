package one.digitalInnovation.exercicios.IDE;

import java.util.*;

/*
Crie uma classe linguagemFavorita que possua os atributos nome, anoDeCriação e ide.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
    Ordem de inserção
    Ordem natural(nome);
    IDE;
    nome, ano de criação e ide;
Ao final exiba as linguagens no console um abaixo do outro.
 */
public class Main {
    public static void main(String[] args) {
        Set<Linguagens> lista = new HashSet<>();
        lista.add(new Linguagens("Java", 1991,"Intelij"));
        lista.add(new Linguagens("Python", 1990,"Spyder"));
        lista.add(new Linguagens("C", 1972,"Eclipse"));

        System.out.println("\nOrdem de inserção");
        System.out.println(lista);
        Set<Linguagens> listaOrdenada = new TreeSet<>(lista);

        System.out.println("\nOrdem natural(nome):");
        System.out.println(listaOrdenada);

        System.out.println("\nIDE;");
        Set<Linguagens> ordenadaLinguagens = new TreeSet<>(new ComparatorIDE());
        ordenadaLinguagens.addAll(lista);
        System.out.println(ordenadaLinguagens);

        System.out.println("\nNome, ano de criação e ide:");
        Set<Linguagens> ordenadaGeral = new TreeSet<>(new ComparatorNomeAnoIDE());
        ordenadaGeral.addAll(lista);
        System.out.println(ordenadaGeral);

        System.out.println("\nexiba as linguagens no console um abaixo do outro.");
        for(Linguagens Linguagem: lista){
            System.out.println(Linguagem);
        }


    }
}
