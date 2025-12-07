package practice24;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на роскошном викторианском стуле с изысканной резьбой");
    }

    @Override
    public String getDescription() {
        return "Антикварный стул из красного дерева с бархатной обивкой";
    }

    @Override
    public String getType() {
        return "Викторианский стул";
    }
}
