package practice24;

public class MultifunctionalChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на эргономичном стуле. Регулируем высоту и наклон!");
    }

    @Override
    public String getDescription() {
        return "Ортопедический стул с регулировкой высоты, глубины сиденья и поддержкой поясницы";
    }

    @Override
    public String getType() {
        return "Многофункциональный стул";
    }
}