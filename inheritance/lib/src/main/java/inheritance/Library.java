/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {
        Restaurant firstRestaurant=new Restaurant("McDonalds",0,4);
//        System.out.println(firstRestaurant.toString());
        Review newReview = new Review("ummm its perfect and woow", "Mohamad Alkhateeb",1);
        firstRestaurant.addReview(newReview);
        System.out.println(firstRestaurant.toString());
        Review newReview2 = new Review("ummm its perfect and ", "Unknown",5);
        firstRestaurant.addReview(newReview2);
        firstRestaurant.addReview(newReview2);
        System.out.println(firstRestaurant.toString());
    }

}
