package com.isajdqz1.helloworld.zadanie02;

import com.isajdqz1.helloworld.statystyka.Statystyka;
import com.isajdqz1.helloworld.zadanie03.FileReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args){

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

        Statystyka statystyka = new Statystyka();
        statystyka.srednia(uczen1);
        statystyka.srednia(uczen2);
        statystyka.srednia(uczen3);


        statystyka.maksymalna(uczen1);
        statystyka.maksymalna(uczen2);
        statystyka.maksymalna(uczen3);

        statystyka.minimalna(uczen1);
        statystyka.minimalna(uczen2);
        statystyka.minimalna(uczen3);

    }
}
