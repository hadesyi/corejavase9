package ch01.sec06;

import java.util.ArrayList;

public class Invoice {
    private static class Item {  // Invoice 내부에 Item을 중첩 했다.
        String description;
        int quantity;
        double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price() {
            return quantity * unitPrice;
        }

    }

    private ArrayList<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }


}
