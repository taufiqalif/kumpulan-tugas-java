/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_15.Bab_2;

import java.util.Scanner;

/**
 *
 * @author Taufiq Alif Rahman
 */
public class SoalLatihan_3 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int x, y;
        char kuadrat;
        System.out.println("Mencari Kuadran Titik Kordinat ");
        System.out.print("Masukan Nilai X : ");
        x = masuk.nextInt();
        System.out.print("Masukan Nilai Y : ");
        y = masuk.nextInt();
        
        if ((x > 20) && y < 15)
            System.out.println("Kuadrat 1");
        else if ((x < 30) && (y < 40))
            System.out.println("Kuadrat 2");
        else if ((x < 50) && (y < 60))
            System.out.println("Kuadrat 3");
        else if ((x < 70) && (y < 85))
            System.out.println("Kuadrat 4");
        
    }
}
