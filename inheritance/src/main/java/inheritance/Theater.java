package inheritance;

import java.util.LinkedList;

public class Theater implements ReviewThings{

    private String theaterName;
    private LinkedList <Review> movies;

    public Theater(String theaterName) {
        this.theaterName = theaterName;
    }

    @Override
    public void addReview(Review review) {
        movies.add(review);
    }

    @Override
    public void calculateStars(Review review) {

    }

    @Override
    public void dollarsSign(float price) {

    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public LinkedList<Review> getMovies() {
        return movies;
    }

    public void setMovies(LinkedList<Review> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "theaterName='" + theaterName + '\'' +
                ", movies=" + movies +
                '}';
    }
}
