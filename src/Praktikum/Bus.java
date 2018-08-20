/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;
import java.text.DecimalFormat;
/**
 *
 * @author User
 */
public class Bus {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(double penumpang){
        double tmbh;
        tmbh = this.penumpang+penumpang;
        if (tmbh> maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = tmbh;
        }
    }
    public void getPenumpang(int password){
        if(password == 27)
        {
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password Salah");
        }
    }
    public void getAverage()
    {
        double Avg;
        double BBPenumpangLama;
        double BBPenumpangBaru;
        double jmlh;
        int BBLama = 40;
        int BBBaru = 45;
        BBPenumpangLama = penumpang*BBLama;
        BBPenumpangBaru = penumpangBaru*BBBaru;
        jmlh = this.penumpang+penumpang;
        Avg = BBPenumpangLama + BBPenumpangBaru/jmlh;
        System.out.println("Rata-rata berat penumpang adalah :  " +Avg+ " dari : "+penumpang);
    }
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang adalah "+penumpang);
        System.out.println("Penumpang Maksimum Seharusnya adalah "+maxPenumpang);          
    }   
}
