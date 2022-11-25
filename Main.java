/**
 *
 * @author Amdzak
 */

package com.main.trapesiumsikusiku;

import java.util.Scanner;

public class TrapesiumSikuSiku {
    public static void main(String[] args) {
        //PEMBUATAN OBJEK SCANNER 
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        double bawah,atas,tinggi,miring,kecil,hasil,kell;
        
        //INPUT USER
        System.out.println("=== Keliling trapesium siku siku ===");
        System.out.print("Masukan alas bawah trapesium : ");
        bawah = input.nextDouble();
        System.out.print("Masukan alas atas trapesium : ");
        atas = input.nextDouble();
        System.out.print("Masukan tinggi trapesium : ");
        tinggi = input.nextDouble();
        
        //PENCARIAN SISI MIRING DAN PENENTUAN KELILING
        kecil = (bawah - atas);
        hasil = (kecil * kecil) + (tinggi * tinggi);
        miring = Math.sqrt(hasil);
        kell = (bawah + tinggi + atas + miring);
        
        //OUTPUT
        System.out.println("Sisi miring adalah = " + miring);
        System.out.println("Keliling = " + kell);
    }
}
