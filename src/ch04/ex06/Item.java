package ch04.ex06;


import java.util.Objects;

public class Item {

    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Item)) {
            return false;
        }

        Item other = (Item) obj;

        return Objects.equals(description, other.description) && (price == other.price);
    }
}
