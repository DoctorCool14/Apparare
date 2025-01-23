package net.doctorcool.apparare.capabilities;

public class PlrRadCapCapability {
    private int radcapacity = 0;

    public int getValue() {
        return radcapacity;
    }

    public void setValue(int value) {
        this.radcapacity = value;
    }

    public void reset() {
        this.radcapacity = 0;
    }
}
