package ch04.ex03;

import java.util.Objects;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + "[label=" + label + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {
            return false;
        }

        LabeledPoint other = (LabeledPoint) obj;

        return Objects.equals(label, other.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, label);
    }
}
