package com.bookmyshow.movieservice.service;

import com.bookmyshow.movieservice.entity.Movie;
import com.bookmyshow.movieservice.entity.model.CreateMovie;
import com.bookmyshow.movieservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getMovies() {
        List<Movie> list = movieRepository.findAll();
        return list;
    }

    public Movie getMoviesById(long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if(movie.isPresent()) {
            return movie.get();
        }
        return null;
    }


    public Movie createMovie(CreateMovie createMovie) {
        Movie movie = new Movie();
        movie.setName(createMovie.getMovieName());
        movie.setActive(true);

        Movie createdMovie = movieRepository.save(movie);
        return createdMovie;
    }
}
