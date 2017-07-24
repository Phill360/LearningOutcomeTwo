package com.company;



public class Main {

    public static void main(String[] args) {


        XboxGame game1 = new XboxGame("halo", Game.genreTypes.ACTION, Game.ratings.M, 1232);


        System.out.println(game1.getTitle());

        game1.print();

    }
}
