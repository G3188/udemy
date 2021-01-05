package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

public class MovieController {
    private MovieService movieService = new MovieService();

    public void addUsingConsole(Movie movie){
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
