package br.ada.americanas.moviesbattle.moviesort;


import br.ada.americanas.moviesbattle.movie.Movie;
import org.springframework.data.util.Pair;

public interface MoviePairSort {

    Pair<Movie, Movie> sort(Iterable<Movie> movies);

}
