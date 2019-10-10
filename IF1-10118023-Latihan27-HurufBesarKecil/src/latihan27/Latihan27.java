/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan27;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Huruf Besar Kecil
 */

public class Latihan27 {

    public static void main(String[] args) {
        String kalimat;
        String hurufBesar;
        String hurufKecil;

        System.out.print("Masukkan Kalimat  : ");
        Scanner input = new Scanner(System.in);
        kalimat = input.nextLine();
        System.out.println("");

        hurufBesar = kalimat.toUpperCase();
        hurufKecil = kalimat.toLowerCase();
        System.out.println("=======Hasil Formatting=======");
        System.out.println("Huruf Besar  : " + hurufBesar);
        System.out.println("Huruf Kecil  : " + hurufKecil);
    }
    
}
