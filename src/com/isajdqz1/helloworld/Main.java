package com.isajdqz1.helloworld;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        Zadanie 1

        String imie = "Milosz"; // zmienna imie
        System.out.println("Hello " + imie); //Hello World
        */

        /*
        System.out.println("Zadanie 2");

        Uczen uczen1 = new Uczen("Imie1","Nazwisko1", new double[]{3.0,4.0});
        System.out.print("Oceny ucznia " + uczen1.getImie() + " " + uczen1.getNazwisko());
        uczen1.wypiszOceny();

        Uczen uczen2 = new Uczen("Imie2","Nazwisko2",new double[]{4.0,5.0});
        System.out.print("Oceny ucznia " + uczen2.getImie() + " " + uczen2.getNazwisko());
        uczen2.wypiszOceny();

        Uczen uczen3 = new Uczen("Imie3","Nazwisko3",new double[]{3.0,2.0});
        System.out.print("Oceny ucznia " + uczen3.getImie() + " " + uczen3.getNazwisko());
        uczen3.wypiszOceny();

        uczen1.srednia();
        uczen2.srednia();
        uczen3.srednia();

        uczen1.maksymalna();
        uczen2.maksymalna();
        uczen3.maksymalna();

        uczen1.minimalna();
        uczen2.minimalna();
        uczen3.minimalna();
        */

        System.out.println("Zadanie 3");

        FileReader fileReader = new FileReader();
        fileReader.readFile();
        fileReader.wyswietlLinie(fileReader.readFile());
        fileReader.pierwszaKolumna(fileReader.readFile());

        //   wczytaniePliku.wyswietlLinie(wczytaniePliku.wczytajPlik());
        //   wczytaniePliku.pierwszaKolumna(wczytaniePliku.wczytajPlik());



        Uczen uczen1 = new Uczen("Imie1","Nazwisko1", new double[]{3.0,4.0});
        System.out.print("Oceny ucznia " + uczen1.getImie() + " " + uczen1.getNazwisko());
        uczen1.wypiszOceny();

        Uczen uczen2 = new Uczen("Imie2","Nazwisko2",new double[]{4.0,5.0});
        System.out.print("Oceny ucznia " + uczen2.getImie() + " " + uczen2.getNazwisko());
        uczen2.wypiszOceny();

        Uczen uczen3 = new Uczen("Imie3","Nazwisko3",new double[]{3.0,2.0});
        System.out.print("Oceny ucznia " + uczen3.getImie() + " " + uczen3.getNazwisko());
        uczen3.wypiszOceny();

        uczen1.srednia();
        uczen2.srednia();
        uczen3.srednia();

        uczen1.maksymalna();
        uczen2.maksymalna();
        uczen3.maksymalna();

        uczen1.minimalna();
        uczen2.minimalna();
        uczen3.minimalna();


    }
}
