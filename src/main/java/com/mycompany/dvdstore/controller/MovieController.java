package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;

public class MovieController {
    private MovieServiceInterface movieServiceInterface ;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingConsole(Movie movie){
        movieServiceInterface.registerMovie(movie);
    }
}
