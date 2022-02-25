package inheritance;

import java.util.ArrayList;

public class Theater {
    ArrayList<String> movies = new ArrayList<>();
    ArrayList<TheaterReview> reviews = new ArrayList<>();

    public Theater(String ...args) {
        for (String el : args) {
            this.movies.add(el);
        }
    }

    public String toString() {
        return "Theater{" +
                "movies=" + movies +
                '}';
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        int movieToRemove = this.movies.indexOf(movie);
        this.movies.remove(movieToRemove);
    }

    public String addReview(TheaterReview review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
            return "Review added!";
        } else {
            return "Cannot add review: review already exists.";
        }
    }
}
