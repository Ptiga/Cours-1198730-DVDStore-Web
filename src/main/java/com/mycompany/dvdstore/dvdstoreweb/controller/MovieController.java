package com.mycompany.dvdstore.dvdstoreweb.controller;

import com.mycompany.dvdstore.controller.MovieControllerInterface;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController implements MovieControllerInterface {

    @Autowired
    private MovieServiceInterface movieService;


    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }


    public void addUsingConsole(){
        Scanner lectureClavier = new Scanner(System.in);

        System.out.println( "Quel est le titre du film ?" );
        String titreFilm = lectureClavier.nextLine();

        System.out.println( "Quel est le genre du film ?" );
        String genreFilm = lectureClavier.nextLine();

        Movie movie = new Movie(titreFilm, genreFilm);

        //MovieService movieService = new MovieService();
        movieService.registerMovie(movie);

    }



}
