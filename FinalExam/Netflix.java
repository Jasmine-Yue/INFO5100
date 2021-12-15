import java.util.ArrayList;

public class Netflix {

    private ArrayList<Genre> genres;


    public Netflix() {
        this.genres =new ArrayList<>() ;
    }


    public  void addGenres(Genre genre ){
      genres.add(genre);
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }
}
