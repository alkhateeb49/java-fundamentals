package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Place {
//    private String name;
//    private int stars;
//    private double averageRating;
    private int price;
//    private int Count;
//    private List<Review> review=new ArrayList<>();

    public Restaurant(String name, int stars, int price) {
        setName(name);
        setPrice(price);
        if(stars>=5){
            setAverageRating(5);
        }else if(stars<=0){
            setAverageRating(0);
        }else{
            setAverageRating(stars);
        }
    }

    public void addReview(Review review){
        if (!this.review.contains(review)) {
            this.review.add(review);
            super.averageRating = super.averageRating + review.numberOfStars;
            super.Count++;
        }else {System.out.println("Review is duplicate");}
    }

    public String toString() {
        String output ="";
        output=output+("name is : ");
        output=output+super.name;
        output=output+(", average stars : ");
        output=output+(averageRating/Count);
        output=output+(", price category, ");
        output=output+(this.price);
        return output;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        super.averageRating = averageRating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }



}
