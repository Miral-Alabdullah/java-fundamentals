/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void restaurantConstructor() {
        Restaurant r = new Restaurant("Atlantis", 12);

        assertEquals("Atlantis", r.getRestaurantName());
        assertEquals(12, r.getPriceCategory(), 0);
    }

    @Test public void restaurantConstructorTest(){
        Restaurant r = new Restaurant("Atlantis", 12);

        assertTrue(r instanceof Restaurant);
    }

    @Test
    public void reviewConstructor() {
        Review review = new Review("Awesome place", "Miral", 2);

        assertEquals("Awesome place", review.getBody());
        assertEquals("Miral", review.getAuthor());
        assertEquals(2, review.getNumberOfStars(), 0);
    }
    @Test public void reviewConstructorTest(){
        Review r = new Review("Awesome place", "Miral", 2);

        assertTrue(r instanceof Review);
    }

    @Test
    public void shopConstructor() {
        Shop shop = new Shop("Blue Scream", "Shining", 12);

        assertEquals("Blue Scream", shop.getShopName());
        assertEquals("Shining", shop.getShopDescription());
        assertEquals(12, shop.getNumberOfDollarSigns(), 0);
    }

    @Test public void shopConstructorTest(){
        Shop shop = new Shop("Blue Scream", "Shining", 12);

        assertTrue(shop instanceof Shop);
    }

    @Test
    public void theaterConstructor() {
        Theater theater = new Theater("Phoenix");

        assertEquals("Phoenix", theater.getTheaterName());
    }

    @Test public void theaterConstructorTest(){
        Theater theater = new Theater("Phoenix");

        assertTrue(theater instanceof Theater);
    }

    @Test
    public void testDollarsSignMethod() {
        Restaurant r = new Restaurant("Atlantis", 5);
        Restaurant r2 = new Restaurant("Atlantis", 40);
        Restaurant r3 = new Restaurant("Atlantis", 22);

        assertEquals("$", r.getPriceCategoryV2());
        assertEquals("$$$", r2.getPriceCategoryV2());
        assertEquals("$$", r3.getPriceCategoryV2());
    }

    @Test public void addReview(){
        Review review = new Review("Awesome place", "Miral", 2);
        Restaurant r = new Restaurant("Atlantis", 12);

        r.addReview(review);
        assertEquals("Name of the restaurant : Atlantis\tNumber of stars : 2.0\tPrice category : $$", r.toString());
    }

    @Test public void toStringTest(){
        Review movies = new Review("Nice Theater", "Miral", 1, "Home Alone");
        Theater theater = new Theater("Phoenix");
        String output = "Theater Name : Phoenix\n" +
                "Feedback : Nice Theater\n" +
                "Author : Miral\n" +
                "Stars : 1.0\n" +
                "Movie : Home Alone";
        theater.addReview(movies);
        assertEquals(output, theater.toString());
    }

    @Test public void addMovies(){
        Theater theater = new Theater("Phoenix");
        theater.addMovie("Home Alone");
        theater.addMovie("The Lord Of The Rings");
        theater.addMovie("Saw");
        assertEquals("[Home Alone, The Lord Of The Rings, Saw]", theater.getMovies().toString());
    }
    @Test public void removeMovies(){
        Theater theater = new Theater("Phoenix");
        theater.addMovie("Home Alone");
        theater.addMovie("The Lord Of The Rings");
        theater.addMovie("Saw");
        theater.removeMovie("Saw");
        assertEquals("[Home Alone, The Lord Of The Rings]", theater.getMovies().toString());
    }
}
