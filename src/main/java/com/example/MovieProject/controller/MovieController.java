package com.example.MovieProject.controller;

import com.example.MovieProject.entity.Movies;
import com.example.MovieProject.service.MoviesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    private final MoviesService moviesService;

    public MovieController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping("/movies")
    public String listMovies(Model model) {
        model.addAttribute("movies", moviesService.getAllMovies());
        return "/movies";//After adding thymeleaf to pom.xml, it could see the employees.html file
    }

    @GetMapping("/movies/new")
    public String createEmployeeForm(Model model) {
        //create student object to hold student form data
        Movies movie = new Movies();
        model.addAttribute("movie", movie);
        return "/create_movie";
    }

    @PostMapping("/movies")
    public String saveEmployee(@ModelAttribute("movie") Movies movie) {
        moviesService.saveMovie(movie);
        return "redirect:/movies";
    }

    @GetMapping("/movies/edit/{id}")
    public String editEmployeeForm(@PathVariable Long id, Model model) {
        model.addAttribute("movie", moviesService.getMovieById(id));
        return "/edit_movie";
    }


    @PostMapping("/movies/{id}")
    public String updateEmployee(@PathVariable Long id, @ModelAttribute("movie") Movies movie,
                                 Model model) {
        //get student from database by id
        Movies existingMovie = moviesService.getMovieById(id);
        existingMovie.setId(id);
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setYear(movie.getYear());
        existingMovie.setRating(movie.getRating());
        existingMovie.setGenre((movie.getGenre()));

        //save updates student object
        moviesService.updateMovie(existingMovie);
        return "redirect:/movies";
    }

    @GetMapping("/movies/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        moviesService.deleteMovieById(id);
        return "redirect:/movies";
    }

}
