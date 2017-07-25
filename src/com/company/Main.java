package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Game> games = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Games
        games.add(new XboxGame("Halo", Game.genreTypes.ACTION, Game.ratings.M, 1232));
        games.add(new XboxGame("Forza Horizon", Game.genreTypes.ACTION, Game.ratings.M, 1232));
        games.add(new PCGame("The witcher", Game.genreTypes.RPG, Game.ratings.MA, "Steam"));
        games.add(new PS4Game("Sonic", Game.genreTypes.RPG, Game.ratings.MA, true));
        games.add(new PS4Game("Call of Duty: Modern Warefare", Game.genreTypes.RPG, Game.ratings.MA, false));

        // Print all Games
        System.out.println("Thiese are all the games int eh Array List");
        printAll(games);

        // Find a game in the array using the game title
        System.out.print("\n \nWhat game do you want to search for?");
        Game fGame = findGame(sc.next());
        if (fGame != null) {
            fGame.print();
        } else if (fGame == null) {
            System.out.println("Game could not be found");
        }

    }

    // Print all games
    public static void printAll(List<Game> games) {
        for (Game game : games) {
            game.print();
        }
    }

    // Find a Game
    public static Game findGame(String gameTitle) {
        for (Game game : games) {

            if (game.getTitle().toLowerCase().equals(gameTitle.toLowerCase())) {
                return game;
            }
        }
        return null;
    }
}
