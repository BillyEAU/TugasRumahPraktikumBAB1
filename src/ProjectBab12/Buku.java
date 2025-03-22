/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectBab12;

/**
 *
 * @author Lenovo
 */
public class Buku {
    String kategoriBuku, namaBuku; 
    int jumlah;//inisialisasi      
    
    public Buku(String kategoriBuku, String namaBuku, 
    int jumlah){ 
    this.kategoriBuku = kategoriBuku; 
    this.namaBuku = namaBuku; 
    this.jumlah = jumlah; 
    }//Method Constructor 
    String gantikategoriBuku(){ 
    return kategoriBuku; 
    }//untuk mengembalikan nilai variabel 
    String hapusBuku(){ 
    return namaBuku; 
    }//untuk mengembalikan nilai variabel 
    int tambahBuku(){ 
    return jumlah; 
    } //untuk mengembalikan nilai variabel
}

