package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<Product> products = new ArrayList<>();
    List<HotDrink> hotDrinks = new ArrayList<>();
    List<CupOfTea> cupOfTeas = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void addHotDrink(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public HotDrink getHotDrink(String name, int volume) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equalsIgnoreCase(name) && hotDrink.getVolume() == volume) {
                return hotDrink;
            }
        }
        return null;
    }

    public void addCupOfTea(CupOfTea cupOfTea) {
        cupOfTeas.add(cupOfTea);
    }

    public CupOfTea getCupOfTea(String name, int volume, int temperature) {
        for (CupOfTea cupOfTea : cupOfTeas) {
            if (cupOfTea.getName().equals(name)
                && cupOfTea.getVolume() == volume
                && cupOfTea.getTemperature() == temperature) {
                return cupOfTea;
            }
        }
        return null;
    }
}
