package inheritance;

public class Review{
    private String movieName;
    private String body;
    private String author;
    int numberOfStars;

    private String name;
    private String description;
    private String price;

    public Review(String body, String author, int numberOfStars) {
        setBody(body);
        setAuthor(author);
        setNumberOfStars(numberOfStars);
    }

    public Review(String body, String author, int numberOfStars,String movieName) {
        setMovieName(movieName);
        setBody(body);
        setAuthor(author);
        setNumberOfStars(numberOfStars);
    }


    public String toString() {
        String output=(this.author);
        output=output+(", ");
        output=output+(this.numberOfStars);
        output=output+(", ");
        output=output+(this.body);
        return output;
    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
