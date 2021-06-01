/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
class Harga extends Toko{
    int jumlah(){
       System.out.println("Jumlah Barang yang Dibeli = "+jumlah);
       return jumlah;
   }
    int harga;
    int harga1;
    int harga2;
    int diskon;
    int total;
    int jumlah = 2;
           
    
    int Harga(){
        int harga = harga1 + harga2;
        System.out.println("Harga Barang yang Dibeli = "+harga);
        if (jumlah==2){
            diskon = 50000;
            total = harga - diskon;
            System.out.println("Total : " + total);
        } else if(jumlah == 3){
            diskon= 100000;
            total = harga - diskon;
            System.out.println("Total : " + total);
        }else{
            total = harga*jumlah;
            System.out.println("Total : " + total);
        }
        return Harga;
    }
}
