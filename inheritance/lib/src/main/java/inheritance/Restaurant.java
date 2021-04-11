package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private int price;
    private int starsCount;
    private Review review;

    public Restaurant() {
    }
    public Restaurant(String name) {
        this.name = name;
    }
    public Restaurant(String name, int stars, int price) {
        this.name = name;
        this.stars=stars;
        this.price=price;
    }

    public void addReview(Review review){
        if (this.review!=review) {
            this.review = review;
            this.stars = this.stars + review.numberOfStars;
            this.starsCount++;
        }
    }

    public String toString() {
        String output ="";
        output=output+("name is : ");
        output=output+this.name;
        output=output+(", average stars : ");
        output=output+(this.stars/starsCount);
        output=output+(", price category, ");
        output=output+(this.price);
        return output;
    }




}
