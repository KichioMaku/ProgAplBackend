package com.company;

import java.io.IOException;
public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        int[] age = new int[]{4, 5, 7, 11, 12, 15, 15, 21, 40, 45};
        int a = 11;
        Zadanie1.Zadanie1();
        Zadanie2.Zadanie2();
        int wynik = Zadanie3.Zadanie3(a, age);
        System.out.println("Zadanie 3 - wprowadzone dane dają wynik: " + wynik);
        String Data = (new Zadanie5()).data();
        String DataGMT = (new Zadanie5().dataGMT());
        String DataUTC = (new Zadanie5().dataUTC());
        System.out.println("Zadanie 5 - aktualna data to: " + Data);
        System.out.println("Zadanie 5 - aktualna data GMT to: " + DataGMT);
        System.out.println("Zadanie 5 - aktualna data UTC to: " + DataUTC);
        System.out.println(Zadanie6.Zadanie6());
    }

}

