package org.example.Model;

public class Product {
    String name;

    @Override
    public String toString() { //меняем toString
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
