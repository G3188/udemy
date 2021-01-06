package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;


import java.util.Scanner;

public class MovieController {
    private MovieServiceInterface movieServiceInterface ;

    public MovieServiceInterface getMovieServiceInterface() {
        return movieServiceInterface;
    }

    public void setMovieServiceInterface(MovieServiceInterface movieServiceInterface) {
        this.movieServiceInterface = movieServiceInterface;
    }

    public void addUsingConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Movie Title");
        String movieTitle = scanner.nextLine();
        System.out.println("Enter Movie Genre");
        String movieGenre = scanner.nextLine();
        scanner.close();
        Movie movie = new Movie();
        movie.setGenre(movieGenre);
        movie.setTitle(movieTitle);
        this.movieServiceInterface.registerMovie(movie);
    }
}
