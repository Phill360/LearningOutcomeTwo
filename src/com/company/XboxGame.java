package com.company;

/**
 * Created by Phill360 on 24/7/17.
 */
public class XboxGame extends Game{
    private int gamerScore;


    public XboxGame(String title, genreTypes genre, ratings rating, int gamerScore) {

        super(title, platforms.XBOX, genre, rating);
        this.gamerScore = gamerScore;
    }

    public int getGamerScore() {
        return gamerScore;
    }

    public void print(){
        super.print();
        System.out.print(" and has a gamerscore of " + this.getGamerScore() + "\n");
    }
}
