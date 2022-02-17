package doremi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Band {

    @Id @GeneratedValue
    private Long id;

    @NotEmpty
    private String name;

    private boolean active;

    public Band(String name, boolean active) {
        this.setName(name);
        this.setActive(active);
    }

    public Band() { }

    public Long getId() {
        return id;
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
}
