package ch04.ex02;

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

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        LabeledPoint other = (LabeledPoint) obj;

        return super.equals(other) && Objects.equals(label, other.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), label);
    }
}
