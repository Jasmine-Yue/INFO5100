import  java.util.*;
public class Movie {
    private String title;
    private Date releaseDate;
    private ArrayList<String> actors;
    private String  director;

    public Movie(String title, Date releaseDate, ArrayList<String> actors, String director) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.actors = actors;
        this.director = director;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", actors=" + actors +
                ", director='" + director + '\'' +
                '}';
    }
}
