package com.isajdqz1.helloworld.zadanie03;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Zadanie 3");

        FileReader fileReader = new FileReader();
        fileReader.readFile();
        fileReader.wyswietlLinie(fileReader.readFile());

       // Uczen uczen1 = new Uczen(); //not working
     //   uczen1.wczytajUcznia();

    }
}
