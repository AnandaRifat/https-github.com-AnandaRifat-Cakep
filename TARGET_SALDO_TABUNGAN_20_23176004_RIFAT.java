/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23176004_anandarifat_si3;

import java.text.DecimalFormat;

/**
 * NAMA: ANANDA RIFAT AULIA
 * NIM: 23176004
 * PRODI: SISTEM INFORMASI
 * SEMESTER: 3
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG PERHITUNGAN TUNJANGAN APABILA SESEORANG SUDAH MENIKAH
 * @author ananda rifat aulia
 */
public class TARGET_SALDO_TABUNGAN_20_23176004_RIFAT {
     public static void main(String[] args) {
        // Deklarasi variabel
        double SaldoAwal = 3500000; // Saldo awal
        double BungaPerBulan = 0.08; // Bunga 8% per bulan
        double SaldoTarget = 6000000; // Saldo target
        
        // Format Rupiah
        DecimalFormat formatRupiah = new DecimalFormat("Rp#,###.##");

        int Bulan = 1;

        // Perhitungan saldo setiap bulan hingga mencapai target
        while (SaldoAwal < SaldoTarget) {
            double Bunga = SaldoAwal * BungaPerBulan;
            SaldoAwal += Bunga;

            // Menampilkan saldo per bulan
            System.out.println("Saldo di bulan ke-" + Bulan + " " + formatRupiah.format(SaldoAwal));
            Bulan++; // Menaikkan bulan
        }
        System.out.println("Halo Aku Ananda Rifat Aulia");
    }
}

