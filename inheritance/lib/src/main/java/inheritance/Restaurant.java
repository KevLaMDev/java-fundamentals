package inheritance;

import java.util.ArrayList;

public class Restaurant {
    int stars;
    String price;
    String name;
    ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(int stars,  String price, String name) {
        this.stars = stars;
        this.price = price;
        this.name = name;
    }

     String addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
            this.updateRating(review);
            return "Review added!";
        } else {
            return "Cannot add review: review already exists.";
        }
    }

    public void updateRating(Review review) {
        int sumStars = 0;
        for (Review el : this.reviews) {
            sumStars += el.stars;
        }
        this.stars = sumStars / (this.reviews.size());
    }


}
