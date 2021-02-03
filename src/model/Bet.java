package model;

import java.io.Serializable;

public class Bet implements Serializable {
    private int value;
    private double risk;

    @Override
    public String toString() {
        return "model.Bet{" +
                "value=" + value +
                ", risk=" + risk +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public Bet(int value, double risk) {
        this.value = value;
        this.risk = risk;
    }
}
