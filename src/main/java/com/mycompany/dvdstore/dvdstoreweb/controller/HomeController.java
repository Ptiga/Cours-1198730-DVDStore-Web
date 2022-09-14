package com.mycompany.dvdstore.dvdstoreweb.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;

    @RequestMapping("/dvdstore-home")
    public @ModelAttribute("movies") List<Movie> displayHome(){
        System.out.println("Requête DVD-home");
        List<Movie>movies= movieService.getMovieList();
        return movies;
    }

}
