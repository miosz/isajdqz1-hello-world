package com.isajdqz1.helloworld;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReader {

    public List readFile() throws IOException {
        File file = getFile("plik.txt");

        return Files.readAllLines(file.toPath());


    }

    public void pierwszaKolumna(List<String> lines) {
        for (String line : lines) {
            String[] elements = line.split(",");
            if (elements.length==6) {
                System.out.println(elements[0]);
            } else {
                System.out.println("Liczba kolumn jest różna od 6");
            }
        }
    }

    public void wyswietlLinie(List<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private File getFile(String sciezka) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        String filePath = classLoader.getResource(sciezka).getFile();
        return new File(filePath);
    }


}