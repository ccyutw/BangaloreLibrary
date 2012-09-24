/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 9/24/12
 * Time: 9:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    private String movieName ="N/A";
    private String year ="N/A";
    private String director = "N/A";
    private String rating = "N/A";


    public Movie setMovie(String movieName, String year, String director, String rating){
        this.movieName = movieName;
        this.director = director;
        this.year = year;
        this.rating = rating;
        return this;
    }

    public void initMovie(){
         Movie [] movieList = new Movie[3];
         movieList[0] = setMovie("3 idors", "2010", "someone","9");
         movieList[1] = setMovie("Spider Man", "2010", "someone","7");
         movieList[2] = setMovie("Super Man", "2010", "someone","N/A");

    }
    public void showMovie(){


    }


}
