package main;

public abstract class Item {
    private Person sender;
    private Person receiver;

    public Item(Person sender, Person receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public Person getSender() {
        return sender;
    }

    public Person getReceiver() {
        return receiver;
    }
}
