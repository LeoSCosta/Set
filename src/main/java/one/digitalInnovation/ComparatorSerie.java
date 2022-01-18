package one.digitalInnovation;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorSerie implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie) {
        if(!serie1.getNome().equalsIgnoreCase(serie.getNome()))
            return serie1.getNome().compareToIgnoreCase(serie.getNome());
        if(!serie1.getGenero().equalsIgnoreCase(serie.getGenero()))
            return serie1.getGenero().compareToIgnoreCase(serie.getGenero());
        return Integer.compare(serie1.getTempoEpisodio(),serie.getTempoEpisodio());

        }
}
