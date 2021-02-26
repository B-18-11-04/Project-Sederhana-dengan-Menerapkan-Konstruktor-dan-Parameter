/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar2;

/**
 *
 * @author bhasa
 */
public class New2 {

    int sisi;
    int hasil;

    void New2(int sisi) {
        this.sisi = sisi;
    }

    int sisi() {
        return sisi;
    }
    int hitung(){
        hasil=4*sisi;
        System.out.println("Keliling Persegi adalah :"+ hasil);
        return hasil;
    }
}
