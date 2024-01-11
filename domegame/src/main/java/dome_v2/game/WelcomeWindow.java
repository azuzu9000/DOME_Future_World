package main.java.dome_v2.game;

import java.util.Scanner;

public class WelcomeWindow {
    private Scanner scanner;

    public WelcomeWindow(Scanner scanner) {
        this.scanner = scanner;
    }

    public String displayWelcomeMessage() {
        System.out.println("Добро пожаловать в игру DOME");
        System.out.print("Введите имя вашего персонажа: ");
        return scanner.nextLine();
    }

    public boolean displayContinueOptions() {
        System.out.print("Желаете продолжить? (да/нет): ");
        String choice = scanner.nextLine().toLowerCase();
        return choice.equals("да");
    }
}
