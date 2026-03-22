/* Nama File     : Manusia.java
 * Deskripsi     : berisi atribut dan method dalam class Manusia
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 22 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    /**************ATRIBUT************/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /****************METHOD**************/
    //konstruktor tanpa parameter
    public Manusia(){

    }

    //konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    

    //mengembalikan nama
    public String getNama(){
        return nama;
    }

    //mengembalikan jumlah manusia
    public static int getCounterMns(){
        return counterMns;
    }

    //mengembalikan tanggal mulai kerja
    public LocalDate getTglMulaiKerja(){
        return tgl_mulai_kerja;
    }

    //mengembalikan alamat
    public String getAlamat(){
        return alamat;
    }

    //mengembalikan pendapatan
    public double getPendapatan(){
        return pendapatan;
    }

    //mengeset nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //mengeset alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //mengeset pendapatan
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    //printinfo
    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    //abstrak method
    public abstract int hitungMasaKerja();
}