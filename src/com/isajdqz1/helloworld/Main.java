package com.isajdqz1.helloworld;

public class Main {

    public static void main(String[] args) {
        /*
        Zadanie 1

        String imie = "Milosz"; // zmienna imie
        System.out.println("Hello " + imie); //Hello World

        */

        System.out.println("Zadanie 2 ");

        uczen uczen1 = new uczen("Imie1","Nazwisko1",3.0, 4.0);
        System.out.println("Oceny ucznia " + uczen1.imie + " " + uczen1.nazwisko + ". ocena1: " + uczen1.ocena1 + " ocena2: " + uczen1.ocena2);

        uczen uczen2 = new uczen("Imie2","Nazwisko2",3.0,2.0);
        System.out.println("Oceny ucznia " + uczen2.imie + " " + uczen2.nazwisko + ". ocena1: " + uczen2.ocena1 + " ocena2: " + uczen2.ocena2);

        uczen uczen3 = new uczen("Imie3","Nazwisko3",4.0, 5.0);
        System.out.println("Oceny ucznia " + uczen3.imie + " " + uczen3.nazwisko + ". ocena1: " + uczen3.ocena1 + " ocena2: " + uczen3.ocena2);

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
