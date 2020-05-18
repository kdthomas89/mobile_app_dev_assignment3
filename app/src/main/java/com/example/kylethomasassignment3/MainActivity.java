/*
*  This app will generate a random movie from the array when the Get Random Movie button is clicked
* */
package com.example.kylethomasassignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MovieShelfManager movieShelfManager;
    private Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieShelfManager = new MovieShelfManager();
        movieShelfManager.loadMovies();

    }

    public void displayRandomMovieOnClick(View view){
        movie = movieShelfManager.getRandomMovie();

        TextView titleText = (TextView)findViewById(R.id.titleText);
        titleText.setText("Title: " + movie.getTitle());

        TextView yearText = (TextView)findViewById(R.id.yearText);
        yearText.setText("Year: " + movie.getYear());

        TextView runTimeText = (TextView)findViewById(R.id.runTimeText);
        runTimeText.setText("Run Time: " + movie.getRunTime());

        TextView genreText = (TextView)findViewById(R.id.genreText);
        genreText.setText("Genre: " + movie.getGenre());
    }



}
