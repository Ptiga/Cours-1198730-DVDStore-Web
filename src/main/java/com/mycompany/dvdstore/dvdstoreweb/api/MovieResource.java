package com.mycompany.dvdstore.dvdstoreweb.api;

import com.mycompany.dvdstore.dvdstoreweb.form.MovieForm;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieResource { //implements MovieControllerInterface {



    @Autowired
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }


    @GetMapping("")
    List<Movie> list(){
        System.out.println("Requête DVD-home");
        return movieService.getMovieList();
    }


    @GetMapping("/{id}")
    public Movie get(long id){ //A voir si besoin de passer un string à convertir en Long dans la méthode
        System.out.println("Requête détail film avec l'ID n°"+id);
        return movieService.getMovieById(id);
    }


    @PostMapping("")
    public Movie add(@RequestBody Movie movie){
        return movieService.registerMovie(movie);
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
