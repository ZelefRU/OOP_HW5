package org.example.Controller;

import org.example.Model.CupOfTea;
import org.example.Model.HotDrink;
import org.example.Model.Model;
import org.example.Model.Product;

public class Controller {
    protected Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void createProduct(String name) {
        if (name != null && !name.isEmpty()) {
            model.addProduct(new Product(name));
        }
    }

    public Product getProduct(String name) {
        if (name != null && !name.isEmpty()) {
            return model.getProduct(name);
        }
        return null;
    }

    public void createHotDrink(String name, int volume) {
        if (name != null && !name.isEmpty()
            && volume > 0 && volume < 25) {
            model.addHotDrink(new HotDrink(name, volume));
        }
    }

    public HotDrink getHotDrink(String name, int volume) {
        if (name != null && !name.isEmpty()
                && volume > 0 && volume < 25) {
            return model.getHotDrink(name, volume);
        }
        return null;
    }

    public void createCupOfTea(String name, int volume, int temperature) {
        if (name != null && !name.isEmpty()
                && volume > 0 && volume < 25
                && temperature > -100 && temperature < 100) {
            model.addCupOfTea(new CupOfTea(name, volume, temperature));
        }
    }

    public CupOfTea getCupOfTea(String name, int volume, int temperature) {
        if (name != null && !name.isEmpty()
                && volume > 0 && volume < 25
                && temperature > -100 && temperature < 100) {
            model.getCupOfTea(name, volume, temperature);
        }
        return null;
    }
}
