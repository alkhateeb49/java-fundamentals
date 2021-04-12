package inheritance;

public class Review{
    String body;
    String author;
    int numberOfStars;

    String name;
    String description;
    String price;

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }


    public String toString() {
        String output=(this.author);
        output=output+(", ");
        output=output+(this.numberOfStars);
        output=output+(", ");
        output=output+(this.body);
        return output;
    }

}
