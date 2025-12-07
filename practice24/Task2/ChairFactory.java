package practice24;

import practice24.Chair;

public interface ChairFactory {
    Chair createChair();
    String getFactoryType();
}