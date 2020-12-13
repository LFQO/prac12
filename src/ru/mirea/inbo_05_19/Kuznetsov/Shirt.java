package ru.mirea.inbo_05_19.Kuznetsov;

import java.util.*;

public class Shirt {
    String vCode;
    String type;
    String color;
    String size;

    public Shirt(String s) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String reveal : s.split(",")) {
            arrayList.add(reveal);
        }
        vCode = arrayList.get(0);
        type = arrayList.get(1);
        color = arrayList.get(2);
        size = arrayList.get(3);
    }

    public String toString() {
        return "Артикул: " + vCode + " Наименование: " + type + " Цвет: " + color + " Размер: " + size;
    }
}