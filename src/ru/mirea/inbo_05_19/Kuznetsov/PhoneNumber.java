package ru.mirea.inbo_05_19.Kuznetsov;

public class PhoneNumber {
    int code;
    long number;

    public PhoneNumber(String numbers) {
        if (numbers.charAt(0) != '+') {
            code = 7;
            this.number = Long.parseLong(numbers.substring(1));
        } else {
            code = Integer.parseInt(String.valueOf(numbers.charAt(1)));
            this.number = Long.parseLong(numbers.substring(2));
        }
    }

    public String toString() {
        return String.format("+%d-%d-%d-%d", code, number / 10000000, number % 10000000 / 10000, number % 10000);
    }
}