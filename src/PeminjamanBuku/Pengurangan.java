/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PeminjamanBuku;

/**
 *
 * @author Lenovo
 */
public class Pengurangan extends Buku {
    int kurang;
    public Pengurangan(String kategoriBuku, String namaBuku, int jumlah) {
        super(kategoriBuku, namaBuku, jumlah);
    }
    int total(){
        return jumlah - kurang;
    }
}
