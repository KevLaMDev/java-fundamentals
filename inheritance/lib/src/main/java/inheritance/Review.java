package inheritance;

public class Review {
    int stars;
    String author;
    String body;

    public Review(int reviewStars, String author, String body) {
        this.stars = reviewStars;
        this.author = author;
        this.body = body;
    }

    public void modifyReview(int newStars, String newBody)
    {
        this.stars = newStars;
        this.body = newBody;
    }

}
