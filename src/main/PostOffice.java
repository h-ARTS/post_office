package main;

import java.util.Arrays;

public class PostOffice {
    private Item[] items;
    private int nextFreePos = 0;

    public Item[] getItems() {
        return items;
    }

    public int getNextFreePos() {
        return nextFreePos;
    }

    public PostOffice(int capacity) {
        this.items = new Item[capacity];
    }

    public boolean addItem(Letter letter) {
        if (items.length == nextFreePos) return false;
        items[nextFreePos] = letter;
        nextFreePos++;
        System.out.println("Letter added");
        return true;
    }

    public boolean addItem(Parcel parcel) {
        if (items.length == nextFreePos) return false;
        items[nextFreePos] = parcel;
        nextFreePos++;
        System.out.println("Parcel added");
        return true;
    }

    public boolean addItem(Item item) {
        if (items.length == nextFreePos) return false;
        items[nextFreePos] = item;
        nextFreePos++;
        System.out.println("An Item added");
        return true;
    }

    public void sendItems() {
        for (Item item: items) {
            if (item != null) {
                item.getReceiver().receiveItem(item);
            }
        }
    }

    public void clear() {
        Arrays.fill(items, null);
    }
}
