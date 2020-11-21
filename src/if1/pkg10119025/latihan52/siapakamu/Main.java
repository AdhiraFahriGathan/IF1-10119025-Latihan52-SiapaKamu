/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan52.siapakamu;

/**
 *
 * @author User
 * * NAMA     : ADHIRA FAHRI GATHAN
 * KELAS    : PBO
 * NIM      : 10119025
 * Deskripsi Program : Program ini berisi tentang Siapa Kamu
 */

   public class Main extends Manusia{
     public static void main(String[] args) {
        Manusia oo1 = new Manusia();
        
        Dosen oo2 = new Dosen();
        oo2.setNip("41227829930");
        oo2.setNama("Rizki Adam Kurniawan");
        oo2.setUmur(27);
        oo2.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : " + oo2.getNip());
        oo2.siapaKamu();
        oo2.mengajarApa();
        
        System.out.println();
        
        Mahasiswa oo3 = new Mahasiswa();
        oo3.setNim("10119013");
        oo3.setNama("Fiona Avila Putri");
        oo3.setUmur(19);
        oo3.setKelas("PBO");
        System.out.println("NIM MAHASISWA : " + oo3.getNim());
        oo3.siapaKamu();
        oo3.kelasApa();
        
        System.out.println();
        System.out.println("by. Adhira Fahri Gathan");
        }
}
