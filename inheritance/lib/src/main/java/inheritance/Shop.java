package inheritance;

import java.util.ArrayList;

public class Shop {
    String description;
    String name;
    int price;
    float stars;
    ArrayList<Review> reviews;
    public Shop(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stars = 0;
        reviews = new ArrayList<>();
    }
    public boolean addReview(Review review) {
        try {
            reviews.add(review);
            int sum = 0;

            for(Review thisReview: reviews) {
                sum += thisReview.stars;
            }
            stars = (float) sum / reviews.size();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + "," + "Description: " + description + "," + "Price: " + this.price + "," + "Reviews: " + this.reviews.size();
    }
}
