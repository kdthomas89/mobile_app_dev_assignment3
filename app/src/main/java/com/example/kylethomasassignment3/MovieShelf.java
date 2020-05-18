package com.example.kylethomasassignment3;

import java.util.ArrayList;

public class MovieShelf {
    private ArrayList<Movie> movies;

    // default constructor
    public MovieShelf(){
    }


    // methods that when called, will add a movie to the movies arraylist - called in addMovie method in movieShelfManager
    public void add(final Movie movie){
        if (movies == null) {
            movies = new ArrayList<>();
        }
        movies.add(movie);
    }


    // method that returns the movies arraylist when called - called in getRandomMovie and random method in MovieShelfManager class
    public ArrayList<Movie> getMovies(){
      return movies;
    }

}

