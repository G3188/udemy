package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoLiveMovieRepository {
    private List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter("C:\\temp\\movies.txt",true);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }

}
