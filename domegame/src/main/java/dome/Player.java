package main.java.dome;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private String status;
    private String currentLocation;
    private Quest activeQuest;
    // Player теперь хранит список активных квестов (activeQuests)
    private List<Quest> activeQuests;

    public Player(String name, String status) {
        this.name = name;
        this.status = status;
        this.currentLocation = ""; // Начальная локация
        this.activeQuests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void moveToLocation(String location) {
        currentLocation = location;
        System.out.println("Вы переместились в " + location + ".");
    }

    public Quest getActiveQuest() {
        return activeQuest;
    }

    public void setActiveQuest(Quest quest) {
        this.activeQuest = quest;
    }

    public void acceptQuest(Quest quest) {
        activeQuests.add(quest);
        System.out.println("Вы приняли задание: " + quest.getDescription());
    }
}