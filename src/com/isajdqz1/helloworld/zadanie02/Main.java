package com.isajdqz1.helloworld.zadanie02;

import com.isajdqz1.helloworld.zadanie03.FileReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

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

    }
}
