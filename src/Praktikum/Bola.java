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
import java.lang.Math;
public class Bola {
    public int jarijari;
    public double phi = 3.14;
    public int getjarijari(){
    return jarijari;   
}
    public double getphi(){
        return phi;
    }
    public void setjarijari(int newJarijari){
        jarijari = newJarijari;
    }
    public void setphi(double newPhi){
        phi=newPhi;             
    }
    public void showDiameter(){
        int D;
        D = jarijari * 2;
        
        System.out.println("diameter : " +D+ "cm");
    
    }
    public void showluas(){
    double l;
    l = 4*Math.PI*jarijari*jarijari;
        System.out.println("luas : " +l+ "cm kuadrat");
    }
    public void showVolume(){
        double V;
        V = (4*Math.PI*jarijari*jarijari*jarijari)/3;
        System.out.println("Volume : " +V+ "cm kubik");
    }
    
}
