package inheritance;

import java.util.ArrayList;

public class Restaurant {
    int price;
    float stars;
    String name;
    ArrayList<Review> reviews;


    public Restaurant(String name, int price){
        this.name = name;
        this.stars = 0;
        this.price = price;
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
        return "Restaurants" + this.name + stars + this.reviews.size() + price;
    }
}
