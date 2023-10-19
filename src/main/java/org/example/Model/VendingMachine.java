package org.example.Model;

import java.util.List;

public interface VendingMachine<T extends HotDrink> {

    void addProducts(List<T> newList);
    void printProduct(String name);

}
