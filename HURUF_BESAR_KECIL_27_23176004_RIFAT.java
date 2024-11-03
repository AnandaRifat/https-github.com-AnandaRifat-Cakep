/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23176004_anandarifat_si3;

import java.util.Scanner;

/**
 * NAMA: ANANDA RIFAT AULIA
 * NIM: 23176004
 * PRODI: SISTEM INFORMASI
 * SEMESTER: 3
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG PENGUBAHAN HURUF BESAR DAN KECIL
 * @author ananda rifat aulia
 */
public class HURUF_BESAR_KECIL_27_23176004_RIFAT {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

    if (kalimat.isEmpty()) {
        System.out.println("Kalimat tidak boleh kosong!");
    } else {
        
        // Mengubah menjadi huruf besar
        String hurufBesar = kalimat.toUpperCase();

        // Mengubah menjadi huruf kecil
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : " + hurufBesar);
        System.out.println("Huruf Kecil : " + hurufKecil);        
    }
    System.out.print("Halo Aku Ananda Rifat Aulia");
  }
}
