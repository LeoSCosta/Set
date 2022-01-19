package one.digitalInnovation.exercicios.arcoIris;


import java.util.*;

/*
Crie um conjunto contendo as cores do arco-iris e:
    Exiba todas as cores uma abaixo da outra;
    A quantidade de cores que o arco-iris tem;
    Exiba as cores em ordem alfabética;
    Exiba as cores na ordem inversa da que foi informada;
    Exiba todas as cores que começam com a letra "V";
    Remova todas as cores que nao começam com a letra "V";
    Limpe o conjunto;
    Confira se conjunto esta vazio;
 */
public class Main {
    public static void main(String[] args) {
        Set<String> arcoIris= new HashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarelo");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");

        System.out.println(arcoIris);

        System.out.println("\nExiba todas as cores uma abaixo da outra:");
        for (String arcoiris: arcoIris){
            System.out.println(arcoiris);
        }

        System.out.println("\nA quantidade de cores que o arco-iris tem:");
        System.out.println(arcoIris.size());

        Set<String> arcoirisAlfa = new TreeSet<>(new ComparatorCor());
        arcoirisAlfa.addAll(arcoIris);
        System.out.println("\nExiba as cores em ordem alfabética;");
        System.out.println(arcoirisAlfa);

        System.out.println("\nExiba as cores na ordem inversa da que foi informada:");
        Set<String> arcoirisPadrao = new LinkedHashSet<>(arcoIris);
        List<String> arcoIrisReverso = new ArrayList<>(arcoirisPadrao);
        Collections.reverse(arcoIrisReverso);
        System.out.println(arcoIrisReverso);

        System.out.println("\nExiba todas as cores que começam com a letra V:");
        for(String cores: arcoIris){
            if(cores.startsWith("V")){
                System.out.println(cores);
            }
        }

        System.out.println("\nRemova todas as cores que nao começam com a letra V");

        for(String cor: arcoIris){
            if(cor.startsWith("V")){
                System.out.print(cor + " Remover:");
                System.out.println(arcoirisAlfa.remove(cor));
            }
        }
        arcoIris = arcoirisAlfa;
        System.out.println(arcoIris);

        System.out.println("\nLimpe o conjunto");
        arcoIris.clear();
        System.out.println("\nConfira se conjunto esta vazio: " + arcoIris.isEmpty());


    }
}
