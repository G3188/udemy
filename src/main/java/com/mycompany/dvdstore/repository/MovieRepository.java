package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie){
        movieList.add(movie);
        System.out.println("The movie"+" "+ movie.getTitle()+" "+"has been added");

    }
}
