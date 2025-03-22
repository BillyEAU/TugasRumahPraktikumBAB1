/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectBab12;

import PeminjamanBuku.*;

/**
 *
 * @author Lenovo
 */
public class CLI_Peminjaman {
    public static void main(String[] args){
        Buku kategori1 = new Buku("Fiksi", "Spider-man", 4);//membuat object
        Buku kategori2 = new Buku("Non-Fiksi", "Alan Turing: The Enigma", 1);
        Buku kategori3 = new Buku("Pendidikan", "Smart Learning in the Digital Age", 0);
        Buku kategori4 = new Buku("Teknologi", "Cybersecurity Essentials", 2);//mengisikan data pada object
        
        //lalu ditampilkan
        System.out.println("Data Buku yang diPinjam");
        System.out.println("Buku dengan Kategori " + kategori1.kategoriBuku);
        System.out.println("Judul : " + kategori1.namaBuku);
        System.out.println("Jumlah : " + kategori1.jumlah);
        System.out.println("\n");
        System.out.println("Buku dengan Kategori " + kategori2.kategoriBuku);
        System.out.println("Judul : " + kategori2.namaBuku);
        System.out.println("Jumlah : " + kategori2.jumlah);
        System.out.println("\n");
        System.out.println("Buku dengan Kategori " + kategori3.kategoriBuku);
        System.out.println("Judul : " + kategori3.namaBuku);
        System.out.println("Jumlah : " + kategori3.jumlah);
        System.out.println("\n");
        System.out.println("Buku dengan Kategori " + kategori4.kategoriBuku);
        System.out.println("Judul : " + kategori4.namaBuku);
        System.out.println("Jumlah : " + kategori4.jumlah);
    }
}
