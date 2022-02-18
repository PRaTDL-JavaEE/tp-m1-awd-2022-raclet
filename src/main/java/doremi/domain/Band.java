package doremi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Band {

    @Id @GeneratedValue
    private Long id;

    @NotEmpty
    private String name;

    private boolean active;

    @OneToMany(mappedBy = "band", fetch = FetchType.EAGER) @JsonIgnore
    private Collection<Album> albums = new ArrayList<>();

    public Band(String name, boolean active) {
        this.setName(name);
        this.setActive(active);
    }

    public Band() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Collection<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {
        if (!this.albums.contains(album))
            this.albums.add(album);
        album.setBand(this);
    }

    public void removeAlbum(Album album) {
        album.setBand(null);
        this.albums.remove(album);
    }
}
