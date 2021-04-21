package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Place{
//    String name;
    List<String> movieList = new ArrayList<>();
//    private double averageRating;
//    private int Count;
//    private List<Review> review=new ArrayList<>();


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
        String output =this.name+", "+(this.averageRating/this.Count)+", ";
        for (String movie: this.movieList) {
            output=output+(", ");
            output=output+(movie);
        }
        return output;
    }
    public void addReview(Review review){
        if (!this.review.contains(review)) {
            this.review.add(review);
            this.averageRating = this.averageRating + review.numberOfStars;
            this.Count++;
        }
    }

}
