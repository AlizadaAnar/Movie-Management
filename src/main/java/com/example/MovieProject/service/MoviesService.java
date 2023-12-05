package com.example.MovieProject.service;

import com.example.MovieProject.entity.Movies;

import java.util.List;

public interface MoviesService {

    List<Movies> getAllMovies();

    Movies saveMovie(Movies movies);

    Movies getMovieById(Long id);

    Movies updateMovie(Movies movies);

    void deleteMovieById(Long id);

}
