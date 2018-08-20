/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author User
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus Coba = new Bus(50);
        Coba.getPenumpang(27);
        Coba.cetak();
        Coba.getAverage();
        Coba.addPenumpang(2);
        Coba.cetak();
        Coba.getAverage();
        Coba.addPenumpang(5);
        Coba.cetak();
        Coba.getAverage();
        Coba.addPenumpang(10);
        Coba.cetak();
        Coba.getAverage();
        Coba.addPenumpang(3);
        Coba.cetak();
        Coba.getAverage();
    }
}
