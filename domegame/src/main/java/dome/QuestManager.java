package main.java.dome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestManager {
    private NPC npc;

    public QuestManager(NPC npc) {
        this.npc = npc;
    }

    // Метод talkWithNPC предоставляет информацию о текущем квесте NPC
    // и предлагает игроку принять его.
    // Метод talkWithNPC теперь использует getAvailableQuests
    // для получения списка доступных квестов у NPC.
    public void talkWithNPC(Player player, Scanner scanner) {
        System.out.println("Вы подошли к " + npc.getName() + ".");
        System.out.println(npc.getName() + ": Привет, " + player.getName() + "! У меня есть для тебя задание.");
        Quest currentQuest = npc.getCurrentQuest();
        System.out.println("Задание: " + currentQuest.getDescription());

        System.out.print("Принять задание? (1 - Да, 2 - Нет): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            player.acceptQuest(currentQuest);
            System.out.println("Вы приняли задание. Удачи в выполнении!");
        } else {
            System.out.println("Вы отказались от задания. Возвращайтесь, когда будете готовы.");
        }
//        List<Quest> availableQuests = npc.getAvailableQuests();

//        for (int i = 0; i < availableQuests.size(); i++) {
//            System.out.println((i + 1) + ". " + availableQuests.get(i).getDescription());
//        }
//
//        System.out.print("Выберите номер задания (или 0, чтобы отказаться): ");
//        int choice = scanner.nextInt();
//
//        if (choice >= 1 && choice <= availableQuests.size()) {
//            Quest selectedQuest = availableQuests.get(choice -1);
//            player.acceptQuest(selectedQuest);
//            npc.setCurrentQuest(selectedQuest);
//            System.out.println("Вы приняли задание. Удачи в выполнении!");
//        } else {
//            System.out.println("Вы отказались от задания. Возвращайтесь когда будете готовы.");
//        }

        // Метод который возвращает список доступных квестов.
        // метод getAvailableQuests, который возвращает список доступных квестов.
        // Этот список передается менеджеру квестов (QuestManager),
        // который используется для предложения квестов игроку
        // во время разговора с NPC.


//        Quest currentQuest = npc.getCurrentQuest();
//        System.out.println("Задание: " + currentQuest.getDescription());

//        System.out.print("Принять зажание? (1 - Да, 2 - Нет): ");

        // var 2
//        int choice = scanner.nextInt();

//        if (choice == 1) {
//            player.acceptQuest(currentQuest);
//        }


        // var 1
//        Scanner scanner = new Scanner(System.in);
//        int response = scanner.nextInt();

//        if (response == 1) {
//            System.out.println("Задание принято! Удачи в выполнении.");
//            player.setActiveQuest(currentQuest);
//        } else {
//            System.out.println("Ну как хочешь. Если передумаешь, приходи.");
//        }
    }

}