package calculator;

public class Calculator {

    public static void main(String[] args) {
    Calculatorclass x = new Calculatorclass(); 
        x.settambah(9,3);
        x.setkurang(9,4);
        x.setkali(9,4);
        x.setbagi(9,3);
        System.out.println(" Hasil = " + x.gettambah());
        System.out.println(" Hasil = " + x.getkurang());
        System.out.println(" Hasil = " + x.getkali());
        System.out.println(" Hasil = " + x.getbagi());
    }
}