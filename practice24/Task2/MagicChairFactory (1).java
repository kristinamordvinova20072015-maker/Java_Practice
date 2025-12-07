package practice24;

public class MagicChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }

    @Override
    public String getFactoryType() {
        return "Фабрика магических стульев";
    }
}