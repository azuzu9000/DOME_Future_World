package main.java.dome_v2.game;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WelcomeWindow welcomeWindow = new WelcomeWindow(scanner);

        String playerName = welcomeWindow.displayWelcomeMessage();

        if (welcomeWindow.displayContinueOptions()) {
            startGame(playerName);
        } else {
            System.out.println("Игра завершена.");
        }
        scanner.close();
    }

    private static void startGame(String playerName) {
        System.out.println("Приветствуем " + playerName + "!");

//        GameLogic gameLogic = new GameLogic(playerName);
//        gameLogic.start();
    }
}
