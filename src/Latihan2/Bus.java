/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author User
 */
public class Bus {
    public int penumpang;
    public int maxPenumpang;
    
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }
    public void addPenumpang(int penumpang)
    {
        int temp;
        temp = this.penumpang+penumpang;
        if (temp>= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void cetak() {
        System.out.println("Penumpang Bus Sekarang adalah "+penumpang);
        System.out.println("Penumpang Maksimum Seharusnya adalah "+maxPenumpang);
    }
}
