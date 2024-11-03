/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23176004_anandarifat_si3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * NAMA: ANANDA RIFAT AULIA
 * NIM: 23176004
 * PRODI: SISTEM INFORMASI
 * SEMESTER: 3
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG HARI SEKARANG
 * @author ananda rifat aulia
 */
public class WAKTU_SAAT_INI_26_23176004_RIFAT {
    public static void main(String[] args) {
        // Membuat objek Date untuk mendapatkan waktu saat ini
        Date sekarang = new Date();

        // Mengatur format tanggal dan waktu
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));

        // Menampilkan hasil dengan format yang diinginkan
        System.out.println("Hari ini adalah hari: " + formatTanggal.format(sekarang));
        System.out.println("Halo Aku Ananda RIfat Aulia");
    }
}

