package inheritance;

public class TheaterReview extends Review{
    String movieTitle;

    public TheaterReview(int reviewStars, String author, String body, String movieTitle) {
        super(reviewStars, author, body);
        this.movieTitle = movieTitle;
    }
    public TheaterReview(int reviewStars, String author, String body) {
        super(reviewStars, author, body);
    }
}
