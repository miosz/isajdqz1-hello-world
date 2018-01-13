package com.isajdqz1.helloworld.zadanie02;

import java.util.List;

public class Uczen {
    private String imie;
    private String nazwisko;
    private double[] oceny;


    Uczen(String imie, String nazwisko, double[] oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }


    public void wczytajUcznia(List<String> lines) {
        for (String line : lines) {
            String[] elements = line.split(",");
            imie = elements[0];
            nazwisko = elements[1];

            for (int y = 2; y < 4; y++) {
                oceny[y] = Double.parseDouble(elements[y]);
            }
        }

    }


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double[] getOceny() {
        return oceny;
    }


    public void wypiszOceny() {
        for (double ocena : oceny) {
            System.out.print(ocena + " ");
        }
        System.out.println();
    }
}
