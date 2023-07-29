package org.example.model;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double Weight;


    public Toy(int id, String name, int quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.Weight = frequency;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getWeight() {
        return Weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setWeight(double frequency) {
        this.Weight = frequency;
    }

}

