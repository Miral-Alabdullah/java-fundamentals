/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Restaurant restaurant = new Restaurant("KFC", 12);
        Restaurant restaurant1 = new Restaurant("Popeyes", 30);
        Review review = new Review("Awesome place", "Miral", 2);
        Review review1 = new Review("Bad place", "Yara", 5);
        Review review2 = new Review("Bad place", "Mazzo", 4);



//        Review review2 = new Review("Good", "Noor", 2);
        Shop shop = new Shop("Blue Scream", "Fancy shop", 12);

        Theater theater = new Theater("Plasma");
        Review movies = new Review("Nice Theater", "Miral", 4, "Home Alone");
        Review movies1 = new Review("Nice Theater", "Miral", 2, "Home Alone");
        Review movies2 = new Review("Nice Theater", "Miral", 1, "Home Alone");

        System.out.println("/n===============================/n");
        restaurant.addReview(review);
        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant1.addReview(review1);
        restaurant1.addReview(review);
        restaurant1.addReview(review2);



        shop.addReview(review);


        theater.addReview(movies);
        theater.addReview(movies1);
        theater.addReview(movies2);


        System.out.println("\n =============================== \n");
        restaurant.toString();

        System.out.println("\n =============================== \n");

        restaurant1.toString();

        System.out.println("\n =============================== \n");
        shop.toString();
        System.out.println("\n =============================== \n");
        theater.toString();

    }
}
