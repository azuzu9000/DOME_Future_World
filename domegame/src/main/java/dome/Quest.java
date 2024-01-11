package main.java.dome;
// Класс который предоставляет класс в игре
public class Quest {
    // Описание квеста
    private String description;

    // Конструктор, принимает описание квеста в качестве параметра
    public Quest(String description) {
        this.description = description;
    }

    // Getter
    // Можно получить Описание квеста с помощью метода getDescription()
    public String getDescription() {
        return description;
    }
}
