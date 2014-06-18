package ru.grey.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by stravin on 17.06.2014.
 */
@Entity
@Table(name = "author")
public class Author extends BaseEntity implements Serializable {
    static final long serialVersionUID = 1L;

    @Column(name = "fio")
    private String fio;
    @Column(name = "year_of_birth")
    private int yearOfBirth;
    @Column(name = "bio")
    private String biography;

    //@ManyToMany(targetEntity = Book.class)
    //List<Book> books;

    public Author() {
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fio='" + fio + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", biography='" + biography + '\'' +
                '}';
    }
}
