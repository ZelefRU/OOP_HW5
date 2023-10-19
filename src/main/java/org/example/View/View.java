package org.example.View;

import org.example.Controller.Controller;
import org.example.Model.CupOfTea;
import org.example.Model.HotDrink;
import org.example.Model.Product;

public class View {
    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void viewProduct(String name) {
        Product product = controller.getProduct(name);
        System.out.printf("""
                -Product-
                Name: %s
                -Product-
                                
                """,
                product.getName());
    }

    public void viewProduct(Product product) {
        System.out.printf("""
                -Product-
                Name: %s
                -Product-
                                
                """,
                product.getName());
    }

    public void viewHotDrink(String name, int volume) {
        HotDrink hotDrink = controller.getHotDrink(name, volume);
        System.out.printf("""
                -HotDrink-
                Name: %s
                Volume: %s
                -HotDrink-
                                
                """,
                hotDrink.getName(),
                hotDrink.getVolume());
    }

    public void viewHotDrink(HotDrink hotDrink) {
        System.out.printf("""
                -HotDrink-
                Name: %s
                Volume: %s
                -HotDrink-
                                
                """,
                hotDrink.getName(),
                hotDrink.getVolume());
    }

    public void viewCupOfTea(String name, int volume, int temp) {
        CupOfTea cupOfTea = controller.getCupOfTea(name, volume, temp);
        System.out.printf("""
                -CupOfTea-
                Name: %s
                Volume: %s
                Temp: %s
                -CupOfTea-
                                
                """,
                cupOfTea.getName(),
                cupOfTea.getVolume(),
                cupOfTea.getTemperature());
    }

    public void viewCupOfTea(CupOfTea cupOfTea) {
        System.out.printf("""
                -CupOfTea-
                Name: %s
                Volume: %s
                Temp: %s
                -CupOfTea-
                                
                """,
                cupOfTea.getName(),
                cupOfTea.getVolume(),
                cupOfTea.getTemperature());
    }
}
