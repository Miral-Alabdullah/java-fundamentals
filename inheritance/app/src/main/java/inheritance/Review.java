package inheritance;


public class Review {

    private String body;
    private String author;
    private float numberOfStars;
    private String movieName;

    public Review(String body, String author, float stars){
        if (this.numberOfStars >=0 || this.numberOfStars <=5){
            this.author = author;
            this.body = body;
            this.numberOfStars = stars;
        }
    }

    public Review(String body, String author, float numberOfStars, String movieName) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
        this.movieName = movieName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    @Override
    public String toString() {
        String s;
        if(movieName == null){
            s = "\nFeedback : " + getBody() + "\n" +
                    "Author : " + getAuthor() + "\n" +
                    "Stars : " + getNumberOfStars() + "\n";
            System.out.println(s);
        } else {
            s = "\nFeedback : " + getBody() + "\n" +
                    "Author : " + getAuthor() + "\n" +
                    "Stars : " + getNumberOfStars() + "\n" +
                    "Movie : " + movieName;
        }
        return s;
    }
}
