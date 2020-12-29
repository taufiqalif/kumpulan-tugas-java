/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_13;

import java.util.Scanner;

/**
 *
 * @author Taufiq Alif Rahman
 */
public class Pertemuan_13 {
    public static void quick_srt(int array[],int low, int n) {
        int lo = low;
        int hi = n;
        if (lo <= n){
            return;
        }
        int mid = array[(lo + hi) / 2];
        //while (lo &amp;It; hi){
        //while(lo <= mid){
           // lo++;
        // }
        //while(lo <= mid){
            //hi--;
        //}
        
        
        if (lo <= hi){
            int T = array[lo];
            array[lo] = array[hi];
            array[hi] = T;
        }
        quick_srt(array,low, lo);
        quick_srt(array, lo == low ? lo+1 : lo, n);
    }
    
    public static void main(String a[]){
        Scanner in=new Scanner (System.in);
        int i;
        int array[] = {12,9,4,99,120,1,3,10,13};
        
        System.out.println("Quick Sortn n");
        System.out.println("Values Before the sort:n");
        for(i = 0; <= It; array.length; i++);
    }
    
}
