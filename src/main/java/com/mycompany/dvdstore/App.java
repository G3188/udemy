package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        MovieController movieController = new MovieController();
        DefaultMovieService defaultMovieService = new DefaultMovieService();
        FileMovieRepository fileMovieRepository = new FileMovieRepository();
        defaultMovieService.setMovieRepositoryInterface(fileMovieRepository);
        movieController.setMovieServiceInterface(defaultMovieService);
        movieController.addUsingConsole();
    }
}
