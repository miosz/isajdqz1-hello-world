package com.isajdqz1.helloworld;

public class uczen {
    public String imie;
    public String nazwisko;
    public double ocena1;
    public double ocena2;


    public uczen(String imie, String nazwisko, double ocena1, double ocena2) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getOcena1() {
        return ocena1;
    }

    public double getOcena2() {
        return ocena2;
    }

    public void srednia() {
        double srednia = (this.ocena1 + this.ocena2)/2;
        System.out.println(srednia);
    }

}
