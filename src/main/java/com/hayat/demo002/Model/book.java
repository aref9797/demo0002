package com.hayat.demo002.Model;


import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.None.class,property = "id")
public class book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "book_id")
    @SequenceGenerator(name = "book_id",sequenceName = "book_id",allocationSize = 1)
    private Integer id;
    private String name;
    private Double price;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "writer_id")
    private writer writer;

    public book ()
    {

    }

    public book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public book(Integer id, String name, Double price, com.hayat.demo002.Model.writer writer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    public writer getWriter() {
        return writer;
    }

    public void setWriter(writer writer) {
        this.writer = writer;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
