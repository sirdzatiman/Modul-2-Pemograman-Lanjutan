/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanmodul2;
import java.util.Scanner;
/**
 *
 * @author Sirdzat
 */
public class Percobaan2 {

    public double VolumeTabung(int diameter,int tinggi) {
        int jari2 = diameter / 2;
        double VolumeTabung = Math.PI * Math.pow(jari2, 2) * tinggi;
        return VolumeTabung;
    }
    public double VolumeKerucut(int diameter, int tinggi){
        int Jarijari = diameter/2;
        double VolumeKerucut = Math.PI * Math.pow(Jarijari, 2) * tinggi / 3.0;
        return VolumeKerucut;
    }
    public double VolumeBola(int diameter){
        int Jarijari = diameter / 2;
        double VolumeBola = (4.0/3.0) * Math.PI * Math.pow(Jarijari, 3);
        return VolumeBola;
    }
    public double LuasLingkaran(int diameter){
        int Jarijari = diameter/2;
        double Luas = Math.PI * Math.pow(Jarijari, 2);
        return Luas;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Percobaan2 mt = new Percobaan2();
        
        System.out.println("Masukkan Diameter : ");
        int diameter = in.nextInt();
        
        System.out.println("Masukkan Tinggi Tabung/Kerucut : ");
        int tinggi = in.nextInt();
        
        System.out.println("\nTotal Hasil : ");
        System.out.printf("Volume Tabung : %.2f \n", + mt.VolumeTabung(diameter, tinggi));
        System.out.printf("Volume Kerucut : %.2f \n", + mt.VolumeKerucut(diameter, tinggi));
        System.out.printf("Volume Bola : %.2f \n", + mt.VolumeBola(diameter));
        System.out.printf("Luas Lingkaran : %.2f \n", + mt.LuasLingkaran(diameter));
    }
}