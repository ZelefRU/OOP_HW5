package org.example;
//1) Создаём торговый автомат с возможностью поиска тваора по имени
//2) Делаем клосс товар абстрактным и создаём наследников

import org.example.Controller.Controller;
import org.example.Model.Model;
import org.example.View.View;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);

        controller.createProduct("Name of product");
        controller.createHotDrink("Hot drink", 1);
        controller.createCupOfTea("Tea", 1, 30);

        view.viewProduct("Name of product");
        view.viewHotDrink(controller.getHotDrink("Hot drink", 1));
        view.viewCupOfTea("Tea", 1, 30);



//        CupOfTea cupOfTea1 = new CupOfTea("cup of Tea1",200, 90);
//        CupOfTea cupOfTea2 = new CupOfTea("cup of Tea2",300, 80);
//        CupOfTea cupOfTea3 = new CupOfTea("cup of Tea3",200, 80);
//
//        List<CupOfTea> teaList = new ArrayList<>(List.of(cupOfTea1, cupOfTea2, cupOfTea3));
//        VendingMachineOfHotDrinks vendingMachineOfHotDrinks = new VendingMachineOfHotDrinks();
//        vendingMachineOfHotDrinks.addProducts(teaList);
//        vendingMachineOfHotDrinks.getProduct("cupOfTea2", 300, 80);
//        vendingMachineOfHotDrinks.getProduct("cupOfTea2", 200, 80);
    }
}