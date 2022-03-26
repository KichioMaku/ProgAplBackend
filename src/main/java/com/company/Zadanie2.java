package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Zadanie2 {

    public static void Zadanie2() throws FileNotFoundException {

        System.out.println("Zadanie 2 - Program zapisuje wprowadzone wartości do pliku tekstowego file.txt");
        FileOutputStream outputFile = null;
        try {
            outputFile = new FileOutputStream("OutputFile.txt", true);
        }
        catch (FileNotFoundException exception){
            System.out.println("Nie można zapisać takiego pliku");
            System.exit(1);
        }
        finally {
            PrintWriter printWriter = new PrintWriter(outputFile);
            printWriter.println("Zadanie numer 2- Mateusz Charewicz lab1/2/PROGN");
            printWriter.close();
        }
    }
}

