package com.example.kylethomasassignment3;

public class Movie {

    // properties of the Movie class
    private String title;
    private String year;
    private String runTime;
    private String genre;

    // constructor
    public Movie(String title, String year, String runTime, String genre) {
        this.title = title;
        this.year = year;
        this.runTime = runTime;
        this.genre = genre;
    }
    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
