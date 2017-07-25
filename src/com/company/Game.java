package com.company;

public class Game {

    public enum genreTypes {
        ACTION , FPS, MMO, RPG;
    }

    public enum ratings {


        G, PG, M, MA, R;
    }

    public enum platforms {
        XBOX, PC, PS4;
    }

    private String title;
    private platforms platform;
    private genreTypes genre;
    private ratings rating;

    public Game (String title, platforms platform, genreTypes genre, ratings rating){
    this.title = title;
    this.platform = platform;
    this.genre = genre;
    this.rating = rating;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public platforms getPlatform() {
        return platform;
    }

    public void setPlatform(platforms platform) {
        this.platform = platform;
    }

    public genreTypes getGenre() {
        return genre;
    }

    public String getGenreText() {
        return genre.toString().toLowerCase();
    }

    public void setGenre(genreTypes genre) {
        this.genre = genre;
    }

    public ratings getRating() {
        return rating;
    }

    public String getRatingText() {
        return rating.toString().toUpperCase();
    }

    public void setRating(ratings rating) {
        this.rating = rating;
    }

    public void print() {
        System.out.print(this.getTitle() + " is an " +
                this.getGenreText() + " game and has a rating of " +
                this.getRatingText() + " the game's platform is " +
                this.getPlatform() );
    }
}
