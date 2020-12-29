/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_15;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Taufiq Alif Rahman
 */
public class Pertemuan_15 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        DecimalFormat fm = new DecimalFormat();
        double Rp, $, Euro, hasil;
        
        System.out.print("Masukan Nilai Rupiah : ");
        Rp = masuk.nextDouble();
        
        $ = Rp / 14.158;
        Euro = Rp / 17.29123;
        
        
        System.out.println("Nilai Rupiah : "+ Rp);
        System.out.println("Nilai Dollar : "+ fm.format($)+ " Dollar");
        System.out.println("Nilai Euro   : "+ fm.format(Euro)+ " Euro");
    }
    
}
