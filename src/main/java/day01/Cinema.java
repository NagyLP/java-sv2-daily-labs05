package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    public static List<Movie> movieList = new ArrayList<>();

    public void addMovie (Movie movie) {
        movieList.add(movie);
    }

    public List<String> findMoviesByTime(LocalDateTime time) {
        List<String> findList = new ArrayList<>();

        for (Movie actual : movieList) {
            if (movieContainsTime(actual, time)) {
                findList.add(actual.getMovieName());
            }
        }
        return findList;
    }

    private boolean movieContainsTime(Movie actual, LocalDateTime time) {


    }
}
