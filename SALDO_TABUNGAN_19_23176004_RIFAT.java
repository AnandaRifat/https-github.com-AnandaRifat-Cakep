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
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG MENGHITUNG SALDO TABUNGAN YANG BERTAMBAH KARENA BUNGA SEBESAR 15% SETIAP BULAN
 * @author ananda rifat aulia
 */
public class SALDO_TABUNGAN_19_23176004_RIFAT {
       public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bungaPerBulan = 0.15; // Pertambahan Bunga 15% Setiap Bulan
        int lamaBulan = 6;

        // Format Rupiah
        DecimalFormat formatRupiah = new DecimalFormat("Rp #,###.###");

        // Perhitungan saldo setiap bulan
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            double bunga = saldoAwal * bungaPerBulan;
            saldoAwal += bunga;
            
            System.out.println("Saldo di bulan ke-" + bulan + ": " + formatRupiah.format(saldoAwal));
        }
        System.out.println("Halo Aku Ananda Rifat Aulia");
    }
}
