/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_15;

import java.util.Scanner;

/**
 *
 * @author Taufiq Alif Rahman
 */
public class soal_latihan_101 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        double luas, jari, keliling, mis;
        
        System.out.print("Masukan Nilai Jari-jari : ");
        jari = masuk.nextDouble();
        mis = 5.5;
        System.out.println("Mis : "+ mis);
        System.out.println();
        
        luas = mis* jari * jari;
        keliling = mis* 2 * jari;
        
        System.out.println("Hasil Luas : "+ luas);
        System.out.println("Hasil Keliling : "+ keliling);
    }
}
