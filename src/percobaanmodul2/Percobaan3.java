/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaanmodul2;

import javax.swing.JOptionPane;

/**
 *
 * @author Sirdzat
 */
public class Percobaan3 {

    public double LuasPersegi(double Panjang, double Lebar) {
        return Panjang * Lebar;
    }

    public double LuasSegitiga(double Alas, double Tinggi) {
        return 0.5 * Alas * Tinggi;
    }

    public double LuasLingkaran(double Jarijari) {
        return Math.PI * Math.pow(Jarijari, 2);
    }

    public static void main(String[] args) {
        Percobaan3 mt = new Percobaan3();
        try {
            double Panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Panjang : "));
            System.out.println("Panjang : " + Panjang);

            double Lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Lebar : "));
            System.out.println("Lebar : " + Lebar);

            double Alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Alas : "));
            System.out.println("Alas : " + Alas);

            double Tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tinggi : "));
            System.out.println("Tinggi : " + Tinggi);

            double Jarijari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Jari-Jari : "));
            System.out.println("Jari-Jari : " + Jarijari);

            double LuasPersegi = mt.LuasPersegi(Panjang, Lebar);
            double LuasSegitiga = mt.LuasSegitiga(Alas, Tinggi);
            double LuasLingkaran = mt.LuasLingkaran(Jarijari);
            
            System.out.println("==============================");
            System.out.println("Hasil Perhitungan Luas : \n");
            
            System.out.println("Luas Persegi Panjang : " + String.format("%.2f", LuasPersegi));
            System.out.println("Luas Segitiga : " + String.format("%.2f", LuasSegitiga));
            System.out.println("Luas Lingkaran : " + String.format("%.2f", LuasLingkaran));
            
            JOptionPane.showMessageDialog(null,
                    "Luas Persegi Panjang : " + String.format("%.2f", LuasPersegi) + "\n"
                    + "Luas Segitiga : " + String.format("%.2f",LuasSegitiga) + "\n"
                    + "Luas Lingkaran : " + String.format("%.2f",LuasLingkaran),
                    "Hasil Perhitungan Luas",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException batal) {
            JOptionPane.showMessageDialog(null,
                    "Program Di Batalkan.",
                    "Informasi",
                    JOptionPane.WARNING_MESSAGE);

        }
    }
}
