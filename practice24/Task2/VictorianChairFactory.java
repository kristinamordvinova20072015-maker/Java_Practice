package practice24;

public class VictorianChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public String getFactoryType() {
        return "Фабрика викторианских стульев";
    }
}