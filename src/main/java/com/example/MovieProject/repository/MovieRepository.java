package com.example.MovieProject.repository;

import com.example.MovieProject.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Long> {


}
