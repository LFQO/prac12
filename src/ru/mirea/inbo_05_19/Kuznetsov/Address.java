package ru.mirea.inbo_05_19.Kuznetsov;

import java.util.*;
import java.util.regex.*;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String building;
    String housing;
    String flat;

    public Address(String address) {
        this.setAddress(address);
    }

    public void setAddress(String address) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(address);
        ArrayList<String> words = new ArrayList<>();

        while (matcher.find()) {
            words.add(matcher.group().toLowerCase());
        }
        if (words.size() < 6) {
            System.out.println("Неправильный адрес");
            return;
        }
        country = words.get(0);
        region = words.get(1);
        city = words.get(2);
        street = words.get(3);
        building = words.get(4);
        housing = words.get(5);
        flat = words.get(6);
    }

    public String toString() {
        return "Страна: " + country + "\nРегион: " + region + "\nГород: " + city + "\nУлица: " + street + "\nДом: " + building + "\nКорпус: " + housing + "\nКвартира: " + flat;
    }
}