package inheritance;

import java.util.ArrayList;

public class Theater implements ReviewThings{

    private String theaterName;
    private float numberOfStars;
    private ArrayList<Review> reviews = new ArrayList<>();
    private ArrayList<String> movies = new ArrayList<>();
    public String movieName;


    public Theater(String theaterName) {
        this.theaterName = theaterName;
    }


    public ArrayList<String> addMovie(String movie){
        this.movies.add(movie);
        System.out.println("From addMovie Method : " + movies);
        return movies;
    }

    public ArrayList<String> removeMovie(String movie){
        this.movies.remove(movie);
        return movies;
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
        calculateStars(review.getNumberOfStars());
    }

    public float getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(float numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public void calculateStars(float numberOfStars) {
        float sum = 0;
        for (Review review1: reviews){
            sum += review1.getNumberOfStars();
        }
        this.numberOfStars = sum/reviews.size();
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
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


    @Override
    public String toString() {
        String s = null;
        for (Review i: reviews){
            s = "Theater Name : " + theaterName + i;
        }
        System.out.println(s);
        return s;
    }
}
