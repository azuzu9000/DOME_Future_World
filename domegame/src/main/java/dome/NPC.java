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
        this.currentQuest = generateRandomQuest();          // Генерируем случайный квест при создании NPC
    }

    public String getName() {
        return name;
    }

    // Метод добавляет новый квест в список доступных квестов
    public void offerQuest(Quest quest) {
        availableQuests.add(quest);
    }


    public Quest getCurrentQuest() {
        return currentQuest;
    }

    public void setCurrentQuest(Quest currentQuest) {
        this.currentQuest = currentQuest;
    }

    public List<Quest> getAvailableQuests() {
//        List<Quest> availableQuests = new ArrayList<>();
//        availableQuests.add(npc.getCurrentQuest());
        return availableQuests;
    }

    // Генерация случайного квеста для NPC
    private Quest generateRandomQuest() {
        String[] questDescriptions = {
                "Собрать запчасти для ремонта генератора",
                "Найти утерянные артифакты в Радиозоне",
                "Помочь местным жителям с поиском пропавших товаров"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(questDescriptions.length);
        return new Quest(questDescriptions[randomIndex]);
    }

    // Другие методы NPC

}