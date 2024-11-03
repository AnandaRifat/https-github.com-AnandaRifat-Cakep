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
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG PENGEJAAN NAMA 
 * @author ananda rifat aulia
 */
public class EJAAN_NAMA_25_23176004_RIFAT {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input nama dari pengguna
        System.out.print("Masukkan nama depan anda untuk dieja: ");
        String nama = input.nextLine();

        // Menampilkan ejaan per huruf
        System.out.println("Ejaan untuk \"" + nama + "\" adalah:");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
        System.out.println("Halo Aku Ananda Rifat Aulia");
        input.close();
    }   
}
