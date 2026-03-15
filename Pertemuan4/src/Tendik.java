/* Nama File     : Tendik.java
 * Deskripsi     : berisi atribut dan method dalam class Tendik
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 15 Maret 2026
 */

import java.time.*;

public class Tendik extends Pegawai{
    /************ATRIBUT**********/
    private String bidang;
    private int BUP = 55;

    /***********METHOD*************/
    //konstruktr tanpa parameter
    public Tendik(){

    }

    //kostruktor dengan parameter
    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,String bidang){
        super(NIP,nama,tanggalLahir,tmt,gajiPokok);
        this.bidang = bidang;
    }

    //mengembalikan bidang
    public String getBidang(){
        return this.bidang;
    }

    //mengeset bidang
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    //mengembalikan tunjangan
    public double getTunjangan(){
        return 0.025 * hitungMasaKerja().getYears() * getGajiPokok();
    }

    //tanggal pensiun
    public LocalDate Pensiun(){
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }
    //print info
    public void printInfo(){
        super.printInfo();
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + hitungMasaKerja().getYears() + " tahun " + hitungMasaKerja().getMonths() + " bulan");
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
