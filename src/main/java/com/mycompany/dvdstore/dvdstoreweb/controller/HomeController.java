package com.mycompany.dvdstore.dvdstoreweb.controller;

import com.mycompany.dvdstore.dvdstoreweb.form.MovieForm;
import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MovieServiceInterface movieService;


    @GetMapping("/dvdstore-home")
    public void displayHome(){
        System.out.println("Requête DVD-home");
    }


    @GetMapping("/add-movie-form")
    //public String displayMovieForm(@ModelAttribute Movie movie){
    public void displayMovieForm(@ModelAttribute MovieForm movieForm){
        System.out.println("Affichage formulaire d'ajout de film");
    }

}
