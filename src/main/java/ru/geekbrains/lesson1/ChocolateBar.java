package ru.geekbrains.lesson1;

public class ChocolateBar extends Product {

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public ChocolateBar(String brand, String name, double price, double volume) {
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Плитка] %s - %s - %f [объем: %f]", brand, name, price, volume);
    }
}