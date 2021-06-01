/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Main {
    public static void main(String[] args) {
        Toko tokoSepatu = new Toko();        
        
        Merk merkSepatu = new Merk();
        merkSepatu.name = ("Adidas, Nike");
        
        Size sizeSepatu = new Size();
        sizeSepatu.Size = ("31, 25");
        
        Warna warnaSepatu = new Warna();
        warnaSepatu.warna = ("Gold, White");
        
        Jenis jenisSepatu = new Jenis();
        jenisSepatu.Jenis = ("Sepatu Perempuan, Sepatu Laki-laki");
        
        Kategori kategoriSepatu = new Kategori();
        kategoriSepatu.Kategori = ("Sepatu Olahraga, Sepatu Santai");
        
        Harga jumlahSepatu = new Harga();
        jumlahSepatu.jumlah = 2;
        
        Harga hargaSepatu = new Harga();
        hargaSepatu.harga1 = 900000;
        hargaSepatu.harga2 = 300000;
        
        tokoSepatu.name();
        merkSepatu.name();
        sizeSepatu.Size();
        warnaSepatu.warna();
        jenisSepatu.jenis();
        kategoriSepatu.kategori();
        
        System.out.println("----------------------------------");
        jumlahSepatu.jumlah();
        hargaSepatu.Harga();
    }
}
