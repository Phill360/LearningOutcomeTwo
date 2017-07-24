package com.company;

public class Game {


    public enum genreTypes {
        ACTION , FPS, MMO, RPG;
    }

    public enum ratings {
        G, PG, M, MA, R;
    }


    String title;
    String media;
    genreTypes genre;
    ratings rating;

    public void Rating (String title, String media, genreTypes genre, ratings rating){
        this.title = title;
        this.media = media;
        this.genre = genre;
        this.rating = rating;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public genreTypes getGenre() {
        return genre;
    }

    public void setGenre(genreTypes genre) {
        this.genre = genre;
    }

    public ratings getRating() {
        return rating;
    }

    public void setRating(ratings rating) {
        this.rating = rating;
    }
}
