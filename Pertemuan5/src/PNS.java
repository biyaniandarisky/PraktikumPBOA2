/* Nama File     : PNS.java
 * Deskripsi     : berisi atribut dan method dalam class PNS
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    /*************ATRIBUT**********/
    private String nip;
    private static int counterPNS = 0;

    /**************METHOD************/
    //konstruktor tanpa parameter
    public PNS(){

    }

    //konstruktor dengan parameter
    public PNS(String nama, LocalDate tgl, String alamat, double pendapatan, String nip){
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //mengembalikan nip
    public String getNip(){
        return this.nip;
    }

    //mengeset nip
    public void setNip(String nip){
        this.nip = nip;
    }

    //menghitung jumlah PNS
    public static int getCounterPns(){
        return counterPNS;
    }

    //mnghitung masa kerja
    @Override
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 0; 
    }

    //menghitung pajak
    @Override
    public double hitungPajak(){
        return 0.10 * pendapatan;
    }

    //printinfo
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}
