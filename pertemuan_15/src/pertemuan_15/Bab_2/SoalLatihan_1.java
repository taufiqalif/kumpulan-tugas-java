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
public class SoalLatihan_1 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Float b, t, IMT;
        
        System.out.println("Kriteria Kegemukan");
        System.out.println("==================");
        System.out.print("Masukan berat (KG) : ");
        b = masuk.nextFloat();
        System.out.print("Masukan Tinggi anda (M) : ");
        t = masuk.nextFloat();
        IMT = b / (t * t);
        if (IMT <= 18.5)
            System.out.println("Kurus");
        else if ((18.5 < IMT) && (IMT <= 25))
            System.out.println("Normal");
        else if ((25 < IMT) && (IMT <= 30))
            System.out.println("Gemuk");
        else if (IMT > 30)
            System.out.println("Kegemukan (Obesitas)");
        
        System.out.println("==================");
    }
}
