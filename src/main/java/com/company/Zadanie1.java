package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie1 {

    public static void Zadanie1() throws FileNotFoundException {
        FileInputStream inputFile = null;
        try {
            inputFile = new FileInputStream("InputFile.txt");
        }
        catch (FileNotFoundException exception){
            System.out.println("Nie można znaleźć pliku");
        }
        finally{

            Scanner in = new Scanner(inputFile);
            while(in.hasNext()) {
                System.out.println(in.nextLine());
            }
        }
    }

}

