package practice24;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация паттерна 'Абстрактная фабрика' ===\n");

        // Создаем клиентов
        Client client1 = new Client("Анна");
        Client client2 = new Client("Дмитрий");

        // Создаем фабрики
        ChairFactory[] factories = {
                new VictorianChairFactory(),
                new MultifunctionalChairFactory(),
                new MagicChairFactory()
        };

        // Демонстрируем работу всех фабрик
        for (ChairFactory factory : factories) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("Работает: " + factory.getFactoryType());
            System.out.println("=".repeat(50));

            // Создаем стул
            Chair chair = factory.createChair();

            // Клиенты пробуют сесть
            client1.sit(chair);
            client2.sit(chair);
        }

        // Дополнительный пример: выбор фабрики в runtime
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Динамический выбор фабрики");
        System.out.println("=".repeat(50));

        // Симуляция выбора пользователя
        String[] choices = {"victorian", "multifunctional", "magic"};

        for (String choice : choices) {
            ChairFactory selectedFactory = createFactoryByType(choice);
            if (selectedFactory != null) {
                System.out.println("\nВыбрана фабрика: " + selectedFactory.getFactoryType());
                Chair customChair = selectedFactory.createChair();

                Client specialClient = new Client("Тестовый клиент для " + choice);
                specialClient.sit(customChair);
            }
        }

        System.out.println("\n=== Программа завершена ===");
    }

    // Метод для создания фабрики по типу
    private static ChairFactory createFactoryByType(String type) {
        switch (type.toLowerCase()) {
            case "victorian":
                return new VictorianChairFactory();
            case "multifunctional":
                return new MultifunctionalChairFactory();
            case "magic":
                return new MagicChairFactory();
            default:
                System.out.println("Неизвестный тип фабрики: " + type);
                return null;
        }
    }

    // Дополнительный метод для демонстрации использования
    public static void demonstrateChair(ChairFactory factory, String clientName) {
        System.out.println("\n--- Демонстрация для " + clientName + " ---");
        Chair chair = factory.createChair();
        Client client = new Client(clientName);
        client.sit(chair);
    }
}