/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void restaurantToStringWorks() {
        Restaurant classUnderTest = new Restaurant(4, "$$", "Da Riccardi");
        String correctOutput = "Da Riccardi\nprice:$$\nStars:4";
        assert(classUnderTest.toString().equals(correctOutput));
    }
    @Test void reviewToStringWorks() {
        Review classUnderTest = new Review(2, "Jeff", "solidly meh");
        String correctOutput = "Author:Jeff\n" +
                "Stars:2\n" +
                "solidly meh";
      assert(classUnderTest.toString().equals(correctOutput));
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
    @Test void shopClassConstructorTest() {
        Shop classUnderTest = new Shop("Rene's Cheese Shop", "A cheese and wine store", "$$$");
        assertTrue(classUnderTest instanceof Shop, "shopClassConstructorTest should return true.");
        }
    @Test void shopClassToStringMethodTest() {
        Shop classUnderTest = new Shop("Rene's Cheese Shop", "A cheese and wine store", "$$$");
        assert(classUnderTest.toString().equals("Shop{name='Rene's Cheese Shop', description='A cheese and wine store', price='$$$', reviews=[]}"));
    }
    @Test void shopClassAddReviewMethodTest() {
        Shop classUnderTest = new Shop("Rene's Cheese Shop", "A cheese and wine store", "$$$");
        Review sut = new Review(3, "Rene Himself", "very good place take my word for it.");
        classUnderTest.addReview(sut);
        System.out.println(classUnderTest.reviews.get(0));
        assert(classUnderTest.reviews.size() == 1);
    }
    @Test void theaterClassConstructorTest() {
        Theater sut = new Theater();
        assert(sut instanceof Theater);
    }
    @Test void theaterClassToStringTest() {
        Theater sut = new Theater();
        assert(sut.toString().equals("Theater{movies=[]}"));
    }
    @Test void theaterClassAddMovieMethodTest() {
        Theater sut = new Theater();
        sut.addMovie("The Matrix");
        assert(sut.movies.size() == 1);
    }
    @Test void theaterClassRemoveMovieMethodTest() {
        Theater sut = new Theater("Apocalypse Now");
        sut.removeMovie("Apocalypse Now");
        assert(sut.movies.size() == 0);
    }
    @Test void theaterClassAssociatesReviewsTest() {
        Theater sut = new Theater();
        TheaterReview review = new TheaterReview(4, "Movie Bob", "Nice place!", "Memento");
        sut.addReview(review);
        assert(sut.reviews.size() == 1);
    }
    @Test void theaterClassAllowsOptionalTitleInstanceVarTest() {
        Theater sut = new Theater();
        TheaterReview review = new TheaterReview(4, "Jeff", "Bloody genius");
        sut.addReview(review);
        assert(sut.reviews.size() == 1);
    }

}
