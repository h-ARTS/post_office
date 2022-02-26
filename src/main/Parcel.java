/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package main;

public class Parcel extends Item {
    private double width;
    private double height;
    private double depth;
    private double weight;
    private String content;

    public Parcel(Person sender, Person receiver, double width, double height, double depth, double weight, String content) {
        super(sender, receiver);
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.content = content;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public double getWeight() {
        return weight;
    }

    public String getContent() {
        return content;
    }
}
