package com.company;



/**
 * Created by Phill360 on 25/7/17.
 */
public class PS4Game extends Game {
    Boolean vrGame;

    public PS4Game(String title, genreTypes genre, ratings rating, Boolean vrGame) {

        super(title, platforms.PS4, genre, rating);
        this.vrGame = vrGame;
    }

    public Boolean getVrGame() {
        return vrGame;
    }

    public void setVrGame(Boolean vrGame) {
        this.vrGame = vrGame;
    }

    public void print(){
        super.print();

        if(vrGame == true)
        System.out.print(" and is a VR game " + "\n");
        else
            System.out.print(" and is not a VR game " + "\n");
    }
}
