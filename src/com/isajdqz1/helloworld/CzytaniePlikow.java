package com.isajdqz1.helloworld;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CzytaniePlikow {
    public List wczytajPlik() throws IOException {
        File file = pobierzPlik("Uczniowie.txt");
        return Files.readAllLines(file.toPath());
    }


    private File pobierzPlik(String sciezka) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        String filePath = classLoader.getResource(sciezka).getFile();
        return new File(filePath);
    }

}
