/* Nama File     : Petani.java
 * Deskripsi     : berisi atribut dan method dalam class Petani
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    /************ATRIBUT***********/
    private String asal_kota;
    private static int counterPetani = 0;

    /**************METHOD***********/
    //kontruksi tanpa parameter
    public Petani(){

    }

    //konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl, String alamat, double pendapatan, String asal_kota){
        super(nama,tgl,alamat,pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //mengembalikan asal kota
    public String getAsal_kota(){
        return this.asal_kota;
    }

    //mengembalikan jumlah petani
    public static int getCounterPetani(){
        return counterPetani;
    }

    //mengeset asal kota
    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    //menghitung masa kerja
    @Override
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0;
    }

    //menghitung pajak
    @Override
    public double hitungPajak(){
        return 0;
    }

    //printinfo
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota : " + asal_kota);
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Pajak : " + hitungPajak());

    }
}
