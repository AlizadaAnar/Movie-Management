package com.example.MovieProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "allmovies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_title", nullable = false)
    private String title;

    @Column(name = "movie_year")
    private int year;

    @Column(name = "movie_rating")
    private String rating;

    @Column(name = "movie_genre")
    private String genre;

    public Movies() {

    }

    public Movies(Long id) {
        this.id = id;
    }

    public Movies(String title, int year, String rating, String genre) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }

    public Movies(Long id, String title, int year, String rating, String genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", rating='" + rating + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}


//		(title, year, rating, and genre).
