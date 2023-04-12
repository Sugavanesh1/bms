package com.bookmyshow.movieservice.controller;

import com.bookmyshow.movieservice.entity.Movie;
import com.bookmyshow.movieservice.entity.model.CreateMovie;
import com.bookmyshow.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies(@PathVariable("id") long id) {
        try {
            var list = movieService.getMovies();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMoviesById(@PathVariable("id") long id) {
        try {
            var movie = movieService.getMoviesById(id);
            if (movie == null) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity<>(movie, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody CreateMovie createMovie) {
        try {
            var createdMovie = movieService.createMovie(createMovie);
            return new ResponseEntity<>(createdMovie, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
