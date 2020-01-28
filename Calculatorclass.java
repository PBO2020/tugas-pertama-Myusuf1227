package calculator;
public class Calculatorclass {
    int tambah;
    int kurang;
    int kali;
    int bagi;
     public int gettambah(){
         return tambah;
     }
     public int getkurang(){
         return kurang;
     }
     public int getkali(){
         return kali;
     }
     public int getbagi(){
         return bagi;
     }
     public void settambah (int a, int b){
         this.tambah=a+b;
     }
     public void setkurang (int a, int b){
         this.kurang=a-b;
     }
     public void setkali (int a, int b){
         this.kali=a*b;
     }
     public void setbagi (int a, int b){
         this.bagi=a/b;
     }
}