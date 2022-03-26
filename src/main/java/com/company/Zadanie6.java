package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Zadanie6 {
    public static String Zadanie6() throws IOException {

        Path file = Path.of("InputFile2.txt");
        String fileContent = Files.readString(file);
        String[] splitedText = fileContent.split("\n");
        String value = null;
        for (int i = 0; i < splitedText.length; i++) {
            String part = splitedText[i];
            int counter = i + 1;
            String x = String.valueOf(counter);
            System.out.println(x + " " + part);
            value = x + " " + part;
        }
        return value;
    }
}
