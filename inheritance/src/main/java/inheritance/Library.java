
package inheritance;

public class Library {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Library().getGreeting());


        Restaurant restaurant = new Restaurant("KFC", 12);
        Restaurant restaurant1 = new Restaurant("Popeyes", 10);
        Review review = new Review("Awesome place", "Miral", 2);
        Review review1 = new Review("Bad place", "Yara", 0);;
        Shop shop = new Shop("Bluescream", "Fancy shop", 12);
        Review forMovie = new Review("Nice Theater", "Miral", 4, "The Lord Of The Rings");
        Theater theater = new Theater("Blazma");

        restaurant.addReview(review);
        restaurant1.addReview(review1);

        restaurant.calculateStars(review);
        shop.calculateStars(review);

        restaurant.toString();
        restaurant1.toString();
        theater.addReview(forMovie);

        shop.toString();

    }
}
