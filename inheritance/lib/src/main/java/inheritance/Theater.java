package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    String name;
    List<String> movieList = new ArrayList<>();
    int stars;
    int starsCount;
    Review review;

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movieName) {
        movieList.add(movieName);
    }
    public void removeMovie(String movieName){
        if(movieList.contains(movieName)){
            movieList.remove(movieName);
        }
    }
    public String toString() {
        String output =this.name+", "+(this.stars/this.starsCount)+", ";
        for (String movie: this.movieList) {
            output=output+(", ");
            output=output+(movie);
        }
        return output;
    }
    public void addReview(Review review){
        if (this.review!=review) {
            this.review = review;
            this.stars = this.stars + review.numberOfStars;
            this.starsCount++;
        }
    }

}
