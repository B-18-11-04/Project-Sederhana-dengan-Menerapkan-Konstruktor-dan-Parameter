/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

/**
 *
 * @author bhasa
 */
public class New {
    double alas,tinggi, hasil;
    
    void New(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    void hitung(){
        hasil = 0.5*alas*tinggi;
        System.out.println("Luas Segitiga : "+hasil);
    }
}