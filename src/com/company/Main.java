package com.company;

public class Main {

    public static void main(String[] args) {
        Game game1 = new Game("halo", "digital", Genre.FPS, Ratings.M);

        System.out.println(game1.getTitle());

    }
}
