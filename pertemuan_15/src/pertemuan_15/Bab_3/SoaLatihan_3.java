/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_15.Bab_3;

import java.util.Scanner;

/**
 *
 * @author Taufiq Alif Rahman
 */
public class SoaLatihan_3 {
    public static void main(String[] args) {
         Scanner masuk = new Scanner (System.in);
        System.out.print("Masukan batas bilanganny : ");
        int batas = masuk.nextInt();
        System.out.println("Bilangan Prima dari 2 sampai bil tsb : ");
        for (int i = 2; i < batas; i = i + 2)
            System.out.println(i + " ");
    }
}
