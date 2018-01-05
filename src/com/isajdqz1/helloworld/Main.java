package com.isajdqz1.helloworld;

public class Main {

    public static void main(String[] args) {
        String imie = "Milosz"; // zmienna imie
        System.out.println("Hello " + imie); //Hello World

        uczen uczen1 = new uczen("Imie1","Nazwisko1",3);
        System.out.println(uczen1.imie + " " + uczen1.nazwisko + " ocena: " + uczen1.ocena);

        uczen uczen2 = new uczen("Imie2","Nazwisko2",2);
        System.out.println(uczen2.imie + " " + uczen2.nazwisko + " ocena: " + uczen2.ocena);

        uczen uczen3 = new uczen("Imie3","Nazwisko3",4);
        System.out.println(uczen3.imie + " " + uczen3.nazwisko + " ocena: " + uczen3.ocena);

    }

}
