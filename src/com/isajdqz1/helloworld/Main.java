package com.isajdqz1.helloworld;

public class Main {

    public static void main(String[] args) {
        String imie = "Milosz"; // zmienna imie
        System.out.println("Hello " + imie); //Hello World

        uczen uczen1 = new uczen("Imie1","Nazwisko1",3.0, 4.0);
        System.out.println(uczen1.imie + " " + uczen1.nazwisko + " ocena1: " + uczen1.ocena1 + " ocena2: " + uczen1.ocena2);

        uczen uczen2 = new uczen("Imie2","Nazwisko2",2.0,3.0);
        System.out.println(uczen2.imie + " " + uczen2.nazwisko + " ocena1: " + uczen2.ocena1 + " ocena2: " + uczen2.ocena2);

        uczen uczen3 = new uczen("Imie3","Nazwisko3",4.0, 5.0);
        System.out.println(uczen3.imie + " " + uczen3.nazwisko + " ocena1: " + uczen3.ocena1 + " ocena2: " + uczen3.ocena2);

       uczen1.srednia();
       uczen2.srednia();
       uczen3.srednia();

    }

}
