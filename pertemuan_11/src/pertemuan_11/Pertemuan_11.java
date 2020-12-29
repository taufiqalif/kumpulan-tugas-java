/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_11;

/**
 *
 * @author Taufiq Alif Rahman
 */
public class Pertemuan_11 {
    public static void main(String[] args) {
        int dicari,counter,posisi;
        boolean ketemu;
        int data [] = {10, 20, 30, 40, 50};
                
        ketemu = false;
        posisi = 0;
        
        dicari = 20;
        for (counter = 0;
                counter <= data.length;
                counter++){
            if (dicari == data[counter]){
                ketemu = true;
                posisi = (counter + 1);
                break;
            }
        }
        if (ketemu = true){
            System.out.println(dicari + " ketemu di posisi ke- : " + posisi);
            }else{
            System.out.println(dicari + " tidak ditmukan di dalam array ");
        }
    }
    
}
