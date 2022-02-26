package main;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private Item receivedItem;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Item getReceivedItem() {
        return receivedItem;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void receiveItem(Item item) {
        this.receivedItem = item;
    }

    @Override
    public String toString() {
        return "My name is " + firstName + " " + lastName + " and I live in " + address.toString();
    }
}
