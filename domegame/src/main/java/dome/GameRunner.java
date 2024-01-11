package main.java.dome;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GameIntro.displayWelcomeMessage();

        System.out.println("Как вас зовут?");
        String playerName = scanner.nextLine();

        // Создаем игрока
        Player player = new Player(playerName, "Новичок");
        startNoviceBase(player);

        // Создаем NPC и QuestManager
        NPC questNPC = new NPC("Инженер Билл");
        QuestManager questManager = new QuestManager(questNPC);

//        Quest firstQuest = new Quest("Собрать запчасти для ремонта генератора");
//        questNPC.offerQuest(firstQuest);

        // После появления на базе новичков,
        // предоставим игроку возможность перемещаться по локациям
        moveBetweenLocation(player, questManager, scanner);

        scanner.close();
    }

    private static void startNoviceBase(Player player) {
        System.out.println("Вы - " + player.getName() + ", новичок в городе DOME");
        System.out.println("Блок Новичков - это ваша первая локация, где вы сможете освоиться в городе и начать свои приключения");
        player.moveToLocation("Блок Новичков");
    }

    private static void moveBetweenLocation(Player player, QuestManager questManager, Scanner scanner) {
        int choice;
        do {
            System.out.println("Вы находитесь в " + player.getCurrentLocation());
            System.out.println("Что вы видите вокруг?");

            switch (player.getCurrentLocation()) {
                case "Блок Новичков":
                    System.out.println("1 - Перейти на Центральную Площадь");
                    System.out.println("2 - Перейти в Транзитную Станцию");
                    System.out.println("3 - Поговорить с NPC");
                    break;
                case "Центральная Площадь":
                    System.out.println("1 - Вернуться в Блок Новичков");
                    System.out.println("2 - Перейти в Транзитную Станцию");
                    // поменять на Шлюз to do
                    System.out.println("3 - Перейти в Радиозону");
                    break;
                case "Транзитная Станция":
                    System.out.println("1 - Вернуться в Блок Новичков");
                    System.out.println("2 - Вернуться на Центральную Площадь");
                    System.out.println("3 - Перейти в Радиозону");
                    break;
                case "Радиозона":
                    System.out.println("1 - Вернуться в Блок Новичков");
                    System.out.println("2 - Вернуться на Центральную Площадь");
                    break;
            }
            System.out.println("0 - Завершить игру и выйти");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (player.getCurrentLocation().equals("Блок Новичков")) {
                        moveToServerRoom(player);
                    } else {
                        player.moveToLocation("Серверная");
                    }
                    player.moveToLocation("Блок Новичков");
                    break;
                case 2:
                    player.moveToLocation("Центральная Площадь");
                    break;
                case 3:
                    if (player.getCurrentLocation().equals("Блок Новичков")) {
//                        talkWithNPC(player, questNPC);
                        questManager.talkWithNPC(player, scanner);
                    }
                    break;
                case 4:
                    player.moveToLocation("Транзитная Станция");
                    break;
                case 5:
                    player.moveToLocation("Радиозона");
                    break;
                case 0:
                    System.out.println("Игра завершена. До новых встреч в городе DOME!");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        } while (choice != 0);
    }

    private static void moveToServerRoom(Player player) {
        System.out.println("Вы входите в Серверную. Здесь вы можете получить дополнительную информацию о городе.");
        player.moveToLocation("Серверная");
    }
}