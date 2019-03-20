package com.hayat.demo002.Model;


import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class writer  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "writer_id")
    @SequenceGenerator(name = "writer_id",sequenceName = "writer_id",allocationSize = 1)
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("Books")
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "writer")
    @JsonIgnore
    private List<book> books;


    public writer ()
    {

    }

    public writer(Integer id, String name, List<book> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<book> getBooks() {
        return books;
    }

    public void setBooks(List<book> books) {
        this.books = books;
    }
}
