package tests;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PostOfficeTest {
    private Address address;
    private Address addressReceiver;
    private Person sender;
    private Person receiver;
    private PostOffice postOffice;

    @BeforeEach
    void setUp() {
        address = new Address("Zeltweg", 10, 8000, "Zurich", "Switzerland");
        addressReceiver = new Address("Allenmoosstr", 245, 8050, "Zurich", "Switzerland");
        receiver = new Person("Max", "Hafner", addressReceiver);
        sender = new Person("John", "Doe", address);
        postOffice = new PostOffice(10);
    }

    @Test
    void testAddLetter() {
        Item item = new Letter(sender, receiver, "88.9 x 152.4", "This is your bill.");
        postOffice.addItem(item);

        assertEquals(item, postOffice.getItems()[0]);
        assertEquals(1, postOffice.getNextFreePos());
    }

    @Test
    void testAddParcel() {
        Item item = new Parcel(sender, receiver, 100, 100, 100, 50, "PC Dell");
        postOffice.addItem(item);

        assertEquals(item, postOffice.getItems()[0]);
        assertEquals(1, postOffice.getNextFreePos());
    }

    @Test
    void sendItems() {
        Parcel parcel = new Parcel(sender, receiver, 20, 30, 20, 11, "Laptop Dell");
        postOffice.addItem(parcel);
        postOffice.sendItems();

        assertEquals(receiver.getReceivedItem(), parcel);
    }

    @Test
    void clear() {
        Item item = new Parcel(sender, receiver, 100, 100, 100, 50, "PC Dell");
        Parcel parcel = new Parcel(sender, receiver, 20, 30, 20, 11, "Laptop Dell");
        Letter letter = new Letter(sender, receiver, "3.625 x 6.5", "Invitation for Expo 2020 Dubai");
        postOffice.addItem(item);

        postOffice.addItem(parcel);
        postOffice.addItem(letter);

        postOffice.clear();

        for (Item nullItem : postOffice.getItems()) {
            assertNull(nullItem);
        }
    }
}
