package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Place {
//    String name;
    String description;
    String price;
//    private double averageRating;
//    private int Count;
//    private List<Review> review=new ArrayList<>();


    public Shop(String name, String description,String price)
    {
        this.name = name;
        this.description = description;
        this.price = price;

    }

    public String toString(){
        String out="Name: "+this.name+ ", Price: "+ this.price + ", Description: "+this.description;
        return out;
    }

    public void addReview(Review review){
        if (!this.review.contains(review)) {
            this.review.add(review);
            this.averageRating = this.averageRating + review.numberOfStars;
            this.Count++;
        }
    }

}
