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
        this.price=price;
        if(stars>=5){
            this.stars=5;
        }else if(stars<=0){
            this.stars=0;
        }else{
            this.stars=stars;
        }
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
