package doremi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Album {

    @Id @GeneratedValue
    private Long id;

    @NotNull
    private String title;

    private Genre genre;

    @Min(1950) @Max(2022)
    private int year;

    public Album(String title, Genre genre, int year) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setYear(year);
    }

    public Album() { }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }
}
