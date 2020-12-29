/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_14;

/**
 *
 * @author Taufiq Alif Rahman
 */
public class Pertemuan_14 {
    public static void main(String[] args) {
        cetakAngka(1);
    }
    static void cetakAngka(int angka){
        if (angka <= 10){
            System.out.println(angka + "");
            
            cetakAngka(++angka);
        }
    }
    
}
