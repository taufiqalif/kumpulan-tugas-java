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
public class SoalLatihan_2 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
            int lama, nama;
            double hutang,bunga1,bunga,angsur,sisa,sisa1;
            double angsur1,total=0,totbunga,bayar;
            System.out.println("BCI >>>>>>>>>>>>>>> Bank Cina Indonesia ");
            System.out.println("========================================");
       
            System.out.print("Masukan Nama Peminjam : " );
            nama = masuk.nextInt();
            System.out.print("Besar Pinjaman        = ");
            hutang = masuk.nextFloat();
            System.out.print("Lama Angsuran (bulan) = ");
            lama = masuk.nextInt();
            System.out.println();
        for(int a=1;a<=lama;a++){
            angsur=hutang/lama;
            sisa=hutang-angsur*a;
            bunga=hutang/(sisa+angsur);
            bunga1=bunga*2/100*hutang; 
            bayar=bunga1+angsur;
            total+=bayar;
            System.out.println("Bulan ke - "+a);
            System.out.println("----------------------------");
            System.out.printf("Suku bunga     = %.2f",bunga);
            System.out.println(" persen");
            System.out.printf("Besar bunga    = %.2f",bunga1);
            System.out.println(" Rupiah");
            System.out.printf("Bayar          = %.2f",bayar);
            System.out.println(" Rupiah");
            System.out.printf("Sisa Pinjaman  = %.2f",sisa);
            System.out.println(" Rupiah");
            System.out.println("----------------------------");
        }
    System.out.println("=============================================================================");
    System.out.println(" Pinjaman awal   = "+hutang+" Rupiah");
    System.out.printf("Total Pengembalian (pinjaman awa1+bunga dari bulan  1 - "+lama+"      = %.2f",total);
    System.out.println(" Rupiah");
    System.out.println();
    }
}
