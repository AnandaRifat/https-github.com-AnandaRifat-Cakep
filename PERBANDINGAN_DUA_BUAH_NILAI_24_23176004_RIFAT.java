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
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG MEMBANDINGKAN KEDUA NILAI DAN MENENTUKAN MANA YANG LEBIH BESAR DAN LEBIH KECIL
 * @author ananda rifat aulia
 */
public class PERBANDINGAN_DUA_BUAH_NILAI_24_23176004_RIFAT {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulangi = true;

        System.out.println("=======Program Perbandingan Nilai========");

        while (ulangi) {

            // Input nilai pertama
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = input.nextInt();

            // Input nilai kedua
            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = input.nextInt();

            // Menentukan hasil perbandingan
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }
            System.out.println(); 
            // Menanyakan apakah ingin mengulangi aktivitas
            System.out.print("Ulangi Aktivitas? (Ya/Tidak): ");
            String jawaban = input.next();

            if (jawaban.equalsIgnoreCase("Tidak")) {
                ulangi = false;
            }
            System.out.println(); // Menambahkan jarak antar percobaan
            }
        input.close();
        System.out.println("Program selesai.");
        System.out.println("Halo Aku Ananda Rifat Aulia");
    }
}
