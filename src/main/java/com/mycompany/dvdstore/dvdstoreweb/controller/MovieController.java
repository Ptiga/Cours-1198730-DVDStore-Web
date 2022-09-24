package com.mycompany.dvdstore.dvdstoreweb.controller;

import com.mycompany.dvdstore.controller.MovieControllerInterface;
import com.mycompany.dvdstore.dvdstoreweb.form.MovieForm;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Scanner;

@Controller
@RequestMapping("/movie")
public class MovieController{ //implements MovieControllerInterface {

    @Autowired
    private MovieServiceInterface movieService;


    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
/*
    @GetMapping("/{id}")
    public String displayMovieCard(@PathVariable("id") long id, Model model){
        System.out.println("Requête détail film avec l'ID n°"+id);
        model.addAttribute("movie", movieService.getMovieById(id));
        return "movie-details";
    }
*/

    @PostMapping("/add")
    public String addMovie(@Valid @ModelAttribute MovieForm movieForm, BindingResult results){

        if (results.hasErrors()){
            System.out.println("Not added to file");
            return "add-movie-form";
        }

        movieService.registerMovie(new Movie(movieForm.getId(), movieForm.getTitle(), movieForm.getGenre()));

        return "movie-added";
    }


/*
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
*/


}
