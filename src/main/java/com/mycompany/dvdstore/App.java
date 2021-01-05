package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter movie title" );
        Scanner sc = new Scanner(System.in);
        String movieTitle = sc.nextLine();
        System.out.println("Enter Movie Genre");
        String movieGenre = sc.nextLine();
        sc.close();
        Movie movie = new Movie();
        movie.setGenre(movieGenre);
        movie.setTitle(movieTitle);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
