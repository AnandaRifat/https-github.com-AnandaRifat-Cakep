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
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG NILAI TERBESAR DAN TERKECIL MAHASISWA 
 * @author ananda rifat aulia
 */
public class NILAI_TERBESAR_DAN_TERKECIL_23_23176004_RIFAT {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta nama petugas
        System.out.println("====== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ======");
        System.out.print("Masukkan Nama Petugas: ");
        String namaPetugas = input.nextLine();

        // Meminta jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Membuat array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        // Meminta input nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        // Mencari nilai terbesar dan terkecil
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        System.out.println(" ");
        // Menampilkan hasil
        System.out.println("====== Hasil Nilai Mahasiswa ======");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + ": " + nilaiMahasiswa[i]);
        }
        System.out.println(" ");
        System.out.println("Nilai Terbesar adalah: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah: " + nilaiTerkecil);
        System.out.println("Petugas: " + namaPetugas);
        System.out.println("Halo Aku Ananda Rifat Aulia");
    }
}

