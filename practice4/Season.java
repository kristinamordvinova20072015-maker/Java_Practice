package practice4;

public enum Season {
    WINTER(-5, "Холодное время года"),
    SPRING(10, "Тёплое время года"),
    SUMMER(25, "Жаркое время года"),
    AUTUMN(8, "Прохладное время года");

    // Поля для хранения данных
    private final int avgTemp;
    private final String description;

    // Конструктор enum (всегда private)
    Season(int avgTemp, String description) {
        this.avgTemp = avgTemp;
        this.description = description;
    }

    // Методы для доступа к полям
    public int getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        return description;
    }
}
