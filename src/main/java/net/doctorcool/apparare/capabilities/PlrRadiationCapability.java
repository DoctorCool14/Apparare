package net.doctorcool.apparare.capabilities;

public class PlrRadiationCapability {
    private int radiation = 0;

    public int getValue() {
        return radiation;
    }

    public void setValue(int value) {
        this.radiation = value;
    }

    public void reset() {
        this.radiation = 0;
    }
}
