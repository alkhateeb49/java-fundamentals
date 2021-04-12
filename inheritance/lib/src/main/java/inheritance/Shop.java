package inheritance;

public class Shop {
    String name;
    String description;
    String price;
    int stars;
    int starsCount;
    Review review;

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
        if (this.review!=review) {
            this.review = review;
            this.stars = this.stars + review.numberOfStars;
            this.starsCount++;
        }
    }

}
