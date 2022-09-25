package com.mycompany.dvdstore.dvdstoreweb.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieForm {

    private Long id;
    @Size(min=1,max=20)
    @NotBlank//(message = "Veuillez entrer un titre")
    private String title;
    @NotBlank
    private String genre;
    @Size(min=20,max=250)
    private String description;
    @NotBlank(message = "Veuillez entrer un prénom")
    @Size(max = 20, message = "Entrez un prénom de 20 caractères au plus")
    private String firstName;
    @Size(max = 20, message = "Entrez un nom de 20 caractères au plus")
    private String lastName;


    public MovieForm() {
    }


    public MovieForm(Long id, String title, String genre, String description, String firstName, String lastName) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
