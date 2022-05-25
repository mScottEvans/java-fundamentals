package inheritance;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

public class Theater {
    String name;
    ArrayList<String> movies;
    ArrayList<Review> reviews;


    public Theater(String name) {
        this.name = name;
        movies = new ArrayList<>();
        reviews = new ArrayList<>();
    }
    public void addMovie(String name){
        movies.add(name);
    }
    public void removeMovie(String name){
        movies.remove(name);
    }


    @Override
    public String toString(){
        return "Name of Theater: " + ", " + name + "Movies: " + ", " + movies + ".";
    }
}
