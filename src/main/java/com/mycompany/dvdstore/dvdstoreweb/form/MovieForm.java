package com.mycompany.dvdstore.dvdstoreweb.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieForm {

    private long id;
    @Size(min=1,max=20)
    @NotBlank//(message = "Veuillez entrer un titre")
    private String title;
    @NotBlank
    private String genre;
    @Size(min=20,max=250)
    private String description;


    public MovieForm() {
    }


    public MovieForm(long id, String title, String genre, String description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.description = description;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
