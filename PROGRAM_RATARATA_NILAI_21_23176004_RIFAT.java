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
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG PERHITUNGAN RATA RATA NILAI MAHASISWA
 * @author ananda rifat aulia
 */
public class PROGRAM_RATARATA_NILAI_21_23176004_RIFAT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int JmlhMhs = input.nextInt();

        // Array untuk menyimpan nilai mahasiswa
        int[] NilaiMhs = new int[JmlhMhs];
        int TotNilai = 0;

        // Meminta input nilai setiap mahasiswa
        for (int i = 0; i < JmlhMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            NilaiMhs[i] = input.nextInt();
            TotNilai += NilaiMhs[i];
        }

        // Menghitung rata-rata nilai
        double rataRata = (double) TotNilai / JmlhMhs;

        // Menampilkan hasil
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Halo Aku Ananda Rifat Aulia");
    }
}
