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
public class SoalLatihan_2 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int gaji, jam, jamlebih, totalgaji;
        
        System.out.println("Gaji Kariyawan");
        System.out.print("Lama Kerja (Jam) : ");
        jam = masuk.nextInt();
        
        if ((jam >= 50)&& (jam <= 60)){
            gaji = jam * 5000;
        }else if(jam >= 60){
            jamlebih = jam - 60;
            gaji = (60 * 5000) + (jamlebih * 7500);
        }else{
            gaji = jam * (5000 - 2500);
        }
        System.out.println("Total Gaji : "+ gaji);
    }
}
