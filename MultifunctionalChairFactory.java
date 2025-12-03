package practice24;

public class MultifunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }

    @Override
    public String getFactoryType() {
        return "Фабрика многофункциональных стульев";
    }
}
