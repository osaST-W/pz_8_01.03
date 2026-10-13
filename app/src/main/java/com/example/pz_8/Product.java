package com.example.pz_8;

public class Product {
    private String name;
    private int count;
    private String unit;

    Product(String name, String unit) {
        this.name = name;
        this.count = 0;
        this.unit = unit;
    }

    public String getUnit() { return unit; }
    public void setCount(int count) { this.count = count; }
    public int getCount() { return count; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
}
