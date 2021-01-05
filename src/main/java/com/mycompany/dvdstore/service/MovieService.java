package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService implements MovieServiceInterface{

    public void registerMovie(Movie movie){
        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
        movieRepository.addMovie(movie);
    }
}
