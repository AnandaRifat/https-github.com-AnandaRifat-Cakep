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
 * DESKRIPSI PROGRAM: PROGRAM INI BERISI TENTANG PERHITUNGAN TUNJANGAN  SEBESAR 35% APABILA SUDAH MENIKAH
 * @author ananda rifat aulia
 */
public class PROGMAN_TUNJANGAN_17_23176004_RIFAT {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============ Program Tunjangan ============");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double Gapok = input.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum): ");
        String Status = input.next();  // Mendapatkan input status

        double Tunjangan = Status.equalsIgnoreCase("Menikah") ? 0.35 * Gapok : 0;

        double TotGaji = Gapok + Tunjangan;

        System.out.println("\n======== Hasil Perhitungan Gaji Anda ========");
        System.out.printf("Gaji Pokok\t\t: Rp %.2f%n", Gapok);
        System.out.printf("Tunjangan\t\t: Rp %.2f%n", Tunjangan);
        System.out.printf("Total Gaji\t\t: Rp %.2f%n", TotGaji);
        System.out.println("Halo Aku Ananda Rifat Aulia");

        input.close();
    }
}


