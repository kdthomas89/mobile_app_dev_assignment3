package com.example.kylethomasassignment3;

import java.util.Random;

public class MovieShelfManager {

    private MovieShelf movieShelf;

    // constructor
    public MovieShelfManager() {
        this.movieShelf = movieShelf;
    }

    // method that will add a movie object the arraylist -- used in this class to populate the arrayList
    public void addMovie(Movie movie){
        if (movieShelf == null){
            movieShelf = new MovieShelf();
        }
        movieShelf.add(movie);
    }

    // when called, calls the addMovie method to populate the arraylist - called in mainactivity
    public void loadMovies(){
        // Movie 1
        this.addMovie(new Movie("Suspiria", "1977", "98 minutes", "Horror"));
        // Movie 2
        this.addMovie(new Movie("Ocean's Eleven", "2001", "117 minutes", "Comedy"));
        // Movie 3
        this.addMovie(new Movie("The Endless", "2017", "111 minutes", "Horror"));
        // Movie 4
        this.addMovie(new Movie("Resolution", "2012", "93 minutes", "Horror"));
        // Movie 5
        this.addMovie(new Movie("Twin Peaks: Fire Walk With Me", "1992", "134 minutes", "Mystery"));
        // Movie 6
        this.addMovie(new Movie("The Princess Bride", "1987", "98 minutes", "Fantasy"));
        // Movie 7
        this.addMovie(new Movie("Angel's Egg", "1985", "71 minutes", "Animated"));
        // Movie 8
        this.addMovie(new Movie("Hot Fuzz", "2007", "121 minutes", "Comedy"));
        // Movie 9
        this.addMovie(new Movie("The Social Network", "2010", "120 minutes", "Drama"));
        // Movie 10
        this.addMovie(new Movie("Annihilation", "2018", "115 minutes", "Science Fiction"));
    }

    // method to generate a random number the size of the array list, minus 1 to account for the first array index being 0 - called below
    private int random(){
        Random random = new Random();
        return random.nextInt(movieShelf.getMovies().size() - 1);
    }

    // when called, will call the random method and then return the index of the random number returned by that method - called in main activity to generate movie on button click
    public Movie getRandomMovie() {
        int index = random();
        return movieShelf.getMovies().get(index);
    }


}
