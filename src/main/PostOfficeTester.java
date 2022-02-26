package main;

import java.util.Arrays;

public class PostOfficeTester {
    public static void main(String[] args) {
        Address address = new Address("Zeltweg", 10, 8000,"Zurich", "Switzerland");
        Address addressReceiver = new Address("Allenmoosstr", 245, 8050, "Zurich", "Switzerland");
        Person sender = new Person("John", "Doe", address);
        Person receiver = new Person("Max", "Hafner", addressReceiver);
        PostOffice postOffice = new PostOffice(10);
        Item item = new Letter(sender, receiver, "88.9 x 152.4", "This is your bill.");

        System.out.println(postOffice.addItem(item));
        System.out.println(Arrays.toString(postOffice.getItems()));
        Parcel parcel = new Parcel(sender, receiver, 20, 30, 20, 11, "Laptop Dell");
        postOffice.addItem(parcel);
        postOffice.sendItems();

        System.out.println(receiver.getReceivedItem() == item);

    }
}
