/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_hanip;

/**
 *
 * @author Praktikan
 */
public class Praktikum10_Hanip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //INHERITANCE
//        BangunDatar bd = new BangunDatar("Hitam");
//        System.out.println("Warna bangun datar : " + bd.getWarna());
//        System.out.println();
//        
//        Lingkaran lingkaran = new Lingkaran("Merah",26.0);
//        System.out.println("Luas Lingkaran : " + lingkaran.luas());
//        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
//        System.out.println();
//        
//        SegiTiga segiTiga = new SegiTiga("Kuning",15,7);
//        System.out.println("Luas Segitiga : " + segiTiga.luas());
//        System.out.println("Keliling segitiga : " + segiTiga.keliling());
//        System.out.println();
//        
//        SegiEmpat segiEmpat = new SegiEmpat("Hijau",10);
//        System.out.println("Luas Segiempat : " + segiEmpat.luas());
//        System.out.println("Keliling Segiempat : " + segiEmpat.keliling());
//        System.out.println();
       
        
        //POLYMORP
        BangunDatar bd = new BangunDatar("Hitam");
        System.out.println("Warna bangun datar : " + bd.getWarna());
        System.out.println();
        
        BangunDatar lingkaran = new Lingkaran("Merah",26.0);
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
        System.out.println();
        
        BangunDatar segiTiga = new SegiTiga("Kuning",15,7);
        System.out.println("Luas Segitiga : " + segiTiga.luas());
        System.out.println("Keliling segitiga : " + segiTiga.keliling());
        System.out.println();
        
        BangunDatar segiEmpat = new SegiEmpat("Hijau",10);
        System.out.println("Luas Segiempat : " + segiEmpat.luas());
        System.out.println("Keliling Segiempat : " + segiEmpat.keliling());
        System.out.println();
    }
    
}
