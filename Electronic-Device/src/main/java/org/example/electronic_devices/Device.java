package org.example.electronic_devices;

import java.util.Currency;

public class Device {
    protected DeviceType type;
    protected String name;
    protected double price;
    protected double weight;

    public Device(DeviceType type, String name, double price, double weight) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
