package one.digitalInnovation.exercicios.IDE;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorNomeAnoIDE implements Comparator<Linguagens> {
    @Override
    public int compare(Linguagens linguagens1, Linguagens linguagens2) {
        if(!linguagens1.getNome().equalsIgnoreCase(linguagens2.getNome()))
            return linguagens1.getNome().compareToIgnoreCase(linguagens2.getNome());
        if(!Objects.equals(linguagens1.getAnoDeCriacao(), linguagens2.getAnoDeCriacao()))
            return Integer.compare(linguagens1.getAnoDeCriacao(), linguagens2.getAnoDeCriacao());
        return linguagens1.getIde().compareToIgnoreCase(linguagens2.getIde());
    }
}
