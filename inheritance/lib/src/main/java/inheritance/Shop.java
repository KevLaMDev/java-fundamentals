package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    String price;
    ArrayList<Review> reviews = new ArrayList<>();

    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
            return "Review added!";
        } else {
            return "Cannot add review: review already exists.";
        }
    }
}
