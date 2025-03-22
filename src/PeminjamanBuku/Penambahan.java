/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PeminjamanBuku;

/**
 *
 * @author Lenovo
 */
public class Penambahan extends Buku {
   int tambah;
   String kategoriBuku, namaBuku;
   public Penambahan (String kategoriBuku, String namaBuku, int jumlah){
       super(kategoriBuku, namaBuku, jumlah);
       this.jumlah = tambah;
       this.kategoriBuku = kategoriBuku;
       this.namaBuku = namaBuku;
   }
   int total (){
       return jumlah + tambah;
   }
}
