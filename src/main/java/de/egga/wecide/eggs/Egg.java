package de.egga.wecide.eggs;

import javax.persistence.*;
import java.io.Serializable;

@Entity
// TODO remove the table annotation
@Table(name = "Eggs")
public class Egg implements Serializable {

    @Id
    @GeneratedValue
    // TODO UUIDs, please
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column
    private String state;


    protected Egg() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public Egg(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }
}
