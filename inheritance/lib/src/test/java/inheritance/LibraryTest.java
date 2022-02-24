/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void restaurantClassConstructorWorks() {
        Restaurant classUnderTest = new Restaurant(4, "$$", "Da Riccardi");
        assertTrue(classUnderTest instanceof Restaurant, "restaurantClassConstructorWorks should return true.");
    }
    @Test void reviewClassConstructorWorks() {
        Review classUnderTest = new Review(2, "Jeff", "solidly meh");
        assertTrue(classUnderTest instanceof Review, "restaurantClassConstructorWorks should return true.");
    }
    @Test void reviewIsAssociatedWithRestaurant() {
        Restaurant classUnderTest = new Restaurant(3, "$$$$", "Il SopraVValutato");
        Review gordonReview = new Review(1, "Gordon Ramsay", "Utter garbage");
        classUnderTest.addReview(gordonReview);
        assert(classUnderTest.reviews.size() == 1);
    }
    @Test void associatedReviewUpdatesRestaurantRating() {
        Restaurant classUnderTest = new Restaurant(0, "$$$$", "Il SopraVValutato");
        Review gordonReview = new Review(1, "Gordon Ramsay", "Utter garbage");
        classUnderTest.addReview(gordonReview);
        assert(classUnderTest.stars == 1);
    }
    @Test void alreadyAssociatedReviewDoesNotUpdateRestaurantRating() {
        Restaurant classUnderTest = new Restaurant(0, "$$$$", "Il SopraVValutato");
        Review gordonReview = new Review(1, "Gordon Ramsay", "Utter garbage");
        classUnderTest.addReview(gordonReview);
        classUnderTest.addReview(gordonReview);
        assert(classUnderTest.stars == 1);
    }

}
