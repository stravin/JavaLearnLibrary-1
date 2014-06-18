package ru.grey.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by stravin on 17.06.2014.
 */
@Entity
@Table(name = "book")
public class Book extends BaseEntity implements Serializable {
    static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;
    @Column(name = "year")
    private int year;
    @Column(name = "genre")
    //@ManyToOne(targetEntity = Genre.class)
    //private Genre genre;
    private int genre;

    //@ManyToMany(targetEntity = Author.class)
    //List<Author> authors;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }
}
