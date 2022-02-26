/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package main;

public class Letter extends Item {
    private String letterSize;
    private String message;

    public Letter(Person sender, Person receiver, String letterSize, String message) {
        super(sender, receiver);
        this.letterSize = letterSize;
        this.message = message;
    }

    public String getLetterSize() {
        return letterSize;
    }

    public String getMessage() {
        return message;
    }
}
