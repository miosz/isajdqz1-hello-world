package com.isajdqz1.helloworld.statystyka;

import com.isajdqz1.helloworld.zadanie02.Uczen;

public class Statystyka {
    public void srednia(Uczen uczen) {
        double suma = 0;
        for (double ocena : uczen.getOceny()) {
            suma += ocena;
        }
        double srednia = suma / uczen.getOceny().length;
        System.out.println("Średnia ucznia " + uczen.getImie() + " to: " + srednia);
    }

    public void maksymalna(Uczen uczen) {
        if (uczen.getOceny().length > 0) {
            double maksymalna = 0;
            for (double ocena : uczen.getOceny()) {
                if (maksymalna < ocena) {
                    maksymalna = ocena;
                }
            }
            System.out.println("Maksymalna ocena ucznia " + uczen.getImie() + " to: " + maksymalna);
        } else
            System.out.println("Zero ocen");
    }

    public void minimalna(Uczen uczen) {
        if (uczen.getOceny().length > 0) {
            double minimalna = 999;
            for (double ocena : uczen.getOceny()) {
                if (minimalna > ocena) {
                    minimalna = ocena;
                }
            }
            System.out.println("Minimalna ocena ucznia " + uczen.getImie() + " to: " + minimalna);
        } else
            System.out.println("Zero ocen");
    }
}
