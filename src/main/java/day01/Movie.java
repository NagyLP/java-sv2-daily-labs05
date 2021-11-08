package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private String movieName;
    private List<LocalDateTime> movieDate;

    public Movie(String filmName, List<LocalDateTime> movieDate) {
        this.movieName = filmName;
        this.movieDate = movieDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public List<LocalDateTime> getMovieDate() {
        return movieDate;
    }
}
