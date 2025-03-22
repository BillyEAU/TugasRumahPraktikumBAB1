/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PeminjamanBuku;

/**
 *
 * @author Lenovo
 */
public class Buku {
    public String kategoriBuku, namaBuku;
    int jumlah;//inisialisasi
    
    public Buku(String kategoriBuku, String namaBuku, int jumlah){
        this.kategoriBuku = kategoriBuku;
        this.namaBuku = namaBuku;
        this.jumlah = jumlah;
    }//Method Constructor
//    void namaBuku (namaBuku){
//        this.namaBuku = new nam;
//    }//untuk mengembalikan nilai variabel
    int kurangBuku(){
        return jumlah;
    }//untuk mengembalikan nilai variabel
    int tambahBuku(){
        return jumlah;
    }//untuk mengembalikan nilai variabel
    int total(){
        return 0;
    }
}