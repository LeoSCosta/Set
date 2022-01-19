package one.digitalInnovation.exercicios.arcoIris;

import java.util.Comparator;

public class ComparatorCor implements Comparator<String> {
    @Override
    public int compare(String cor1, String cor2) {
        return cor1.compareToIgnoreCase(cor2);
    }
}
