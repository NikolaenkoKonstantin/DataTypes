package org.example;

public class Main {
    public static void main(String[] args) {
        int book = 0xE32DF;
        long phone = 89522411233L;
        long lastDigBin = 0b100001;
        long lastDigOctal = 02321;
        byte numberStud= (byte)((27 - 1) % 26 + 1);
        char symbol = (char) (numberStud + 65);

        System.out.println(book);
        System.out.println(phone);
        System.out.println(lastDigBin);
        System.out.println(lastDigOctal);
        System.out.println(numberStud);
        System.out.println(symbol);
    }
}