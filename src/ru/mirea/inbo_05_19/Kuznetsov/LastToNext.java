package ru.mirea.inbo_05_19.Kuznetsov;

import java.util.*;

public class LastToNext {
    private final ArrayList<String> list = new ArrayList<>();
    private final ArrayList<String> newList;

    public LastToNext(String string) {
        int i = 0;
        for (String reveal : string.split("\\s")) {
            list.add(reveal);
        }
        newList = function();
    }

    public ArrayList<String> function() {
        ArrayList<String> left;
        ArrayList<String> current;
        ArrayList<String> res;
        for (int i = 0; i < list.size(); i++) {
            current = new ArrayList<>();
            current.add(list.get(i));
            left = new ArrayList<>(list);
            left.remove(i);
            res = function2(left, current);
            if (res != null && check(res)) {
                return res;
            }
        }
        return null;
    }

    public boolean check(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (Character.toLowerCase(arrayList.get(i).charAt(arrayList.get(i).length() - 1)) != Character.toLowerCase(arrayList.get(i + 1).charAt(0))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> function2(ArrayList<String> left, ArrayList<String> current) {
        if (left.size() == 0 && check(current)) {
            return current;
        }
        ArrayList<String> left_;
        ArrayList<String> current_;
        ArrayList<String> res;
        for (int i = 0; i < left.size(); i++) {
            current_ = new ArrayList<>(current);
            current_.add(left.get(i));
            left_ = new ArrayList<>(left);
            left_.remove(i);
            res = function2(left_, current_);
            if (res != null && check(res)) {
                return res;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < newList.size(); i++) stringBuilder.append(newList.get(i) + " ");
        return String.valueOf(stringBuilder);
    }
}