package main.java.dome;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NPC {
    private String name;                 // Имя NPC
    private List<Quest> availableQuests; // Список доступных квестов
    private Quest currentQuest;          // Текущий активный квест

    // Конструктор
    public NPC(String name) {
        this.name = name;
        this.availableQuests = new ArrayList<>();
        this.currentQuest = null;
    }

    public String getName() {
        return name;
    }

    // Метод добавляет новый квест в список доступных квестов
    public void offerQuest(Quest quest) {
        availableQuests.add(quest);
    }

    // Метод который возвращает список доступных квестов.
    // метод getAvailableQuests, который возвращает список доступных квестов.
    // Этот список передается менеджеру квестов (QuestManager),
    // который используется для предложения квестов игроку
    // во время разговора с NPC.
    public List<Quest> getAvailableQuests() {
        return availableQuests;
    }

    public Quest getCurrentQuest() {
        return currentQuest;
    }

    public void setCurrentQuest(Quest currentQuest) {
        this.currentQuest = currentQuest;
    }

    private void generateRandomQuest() {
        String[] possibleQuests = {
                "Собрать запчасти для ремонта генератора",
                "Найти утерянные артифакты в Радиозоне",
                "Помочь местным жителям с поиском пропавших товаров"
        };
        Random random = new Random();
        int index = random.nextInt(possibleQuests.length);
        this.currentQuest = new Quest(possibleQuests[index]);
    }

    // Другие методы NPC

}