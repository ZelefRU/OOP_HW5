package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineOfHotDrinks implements VendingMachine<CupOfTea> {
    public List<CupOfTea> cupOfTeaList = new ArrayList<>();

    @Override
    public void addProducts(List<CupOfTea> cupOfTeaList) {
        this.cupOfTeaList = cupOfTeaList;
        getProductsList();
    }

    public void getProductsList() {
        System.out.println(" Hot Drinks List ");
        System.out.println("| Name |" + "\t" + "| Volume |" + "\t" + "| Temp |");
        for (CupOfTea cupOfTea : cupOfTeaList) {
            System.out.printf(cupOfTea.getName(), cupOfTea.getVolume(), cupOfTea.getTemperature());
        }
    }

    @Override
    public void printProduct(String name) {
        for (CupOfTea cupOfTea : cupOfTeaList) {
            if (cupOfTea.getName().equalsIgnoreCase(name)) {
                System.out.println(cupOfTea);
            }
        }
    }

    public void getProduct(String name, int volume, int temperature) {
        int count = 0;
        for (CupOfTea cupOfTea : cupOfTeaList) {
            if (cupOfTea.getName().equalsIgnoreCase(name) &&
                    cupOfTea.getVolume() == volume &&
                    cupOfTea.getTemperature() == temperature) {
                System.out.println(cupOfTea);
                count++;
            }
        }

        if (count == 0) {
            System.out.print("Product " + name + " with vol " + volume + " and temp " + temperature + " not found");
        } else {
            System.out.println("");
        }

    }
}
