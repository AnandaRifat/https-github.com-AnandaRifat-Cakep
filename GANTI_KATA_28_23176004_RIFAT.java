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
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG GANTI KALIMAT
 * @author ananda rifat aulia
 */
public class GANTI_KATA_28_23176004_RIFAT {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        
        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Ganti Kata: ");
        String kataAsli = input.nextLine();

        System.out.print("Menjadi Kata: ");
        String kataBaru = input.nextLine();
  
        // Validasi input tidak kosong
        if (kalimat.isEmpty() || kataAsli.isEmpty() || kataBaru.isEmpty()) {
            System.out.println("Input tidak boleh kosong!");
        } else {
            // Mengganti kata yang berdiri sendiri
            String kalimatBaru = kalimat.replaceAll("\\b" + kataAsli + "\\b", kataBaru);
        }

        // Mengganti semua kemunculan kataAsli dengan kataBaru
        String kalimatBaru = kalimat.replaceAll(kataAsli, kataBaru);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
        System.out.print("Halo Aku Ananda Rifat Aulia");
    }
}
