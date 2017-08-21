package ch04.ex06;

import java.util.Objects;

public class Ex06 {

    public static void main(String[] args) {

        DiscountedItem discountedItemX =
                new DiscountedItem("star", 1, 0.8);
        Item itemY = new Item("star", 1);
        DiscountedItem discountedItemZ =
                new DiscountedItem("star", 1, 0.9);

        System.out.println(Objects.equals(discountedItemX, itemY));
        System.out.println(Objects.equals(itemY, discountedItemX));
        System.out.println(Objects.equals(itemY, discountedItemZ));
        System.out.println(Objects.equals(discountedItemZ, itemY));
        System.out.println(Objects.equals(discountedItemX, discountedItemZ));
    }
}
