package inheritance;

import com.google.common.cache.AbstractCache;

public class Review {

    final int stars;
    String body;
    String author;

    public Review(String author, String body, int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;

    }
    @Override
    public String toString(){
        return "Name: " + author + "," + "Description: " + body + "," + "Rating: " + stars + ".";
    }

}
