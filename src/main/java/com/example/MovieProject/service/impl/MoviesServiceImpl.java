package com.example.MovieProject.service.impl;

import com.example.MovieProject.entity.Movies;
import com.example.MovieProject.repository.MovieRepository;
import com.example.MovieProject.service.MoviesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService {

    private final MovieRepository movieRepository;

    public MoviesServiceImpl(MovieRepository movieRepository) {
        super();
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movies> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movies saveMovie(Movies movies) {
        return movieRepository.save(movies);
    }

    @Override
    public Movies getMovieById(Long id) {
        return movieRepository.findById(id).get();
    }

    @Override
    public Movies updateMovie(Movies movies) {
        return movieRepository.save(movies);
    }

    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }
}
