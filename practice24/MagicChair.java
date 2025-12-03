package practice24;

public class MagicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Стул парит в воздухе! Ощущение невесомости...");
    }

    @Override
    public String getDescription() {
        return "Зачарованный стул, способный летать и подстраиваться под владельца";
    }

    @Override
    public String getType() {
        return "Магический стул";
    }
}
