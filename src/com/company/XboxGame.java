package com.company;

/**
 * Created by Phill360 on 24/7/17.
 */
public class XboxGame extends Game{
    int gamerScore;


    public XboxGame(String title, genreTypes genre, ratings rating, int gamerScore) {

        super("Halo", Platforms.XBOX, genreTypes.ACTION, ratings.M);
        this.gamerScore = gamerScore;
    }

    public int getGamerScore() {
        return gamerScore;
    }

    public void print(){
        super.print();
        System.out.print(" and has a gamerscore of " + this.getGamerScore());
    }
}