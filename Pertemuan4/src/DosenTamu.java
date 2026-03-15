/* Nama File     : DosenTamu.java
 * Deskripsi     : berisi atribut dan method dalam class DosenTamu
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 15 Maret 2026
 */

import java.time.*;
public class DosenTamu extends Dosen{
    /**************ATRIBUT*********/
    private String NIDK;
    private LocalDate akhirKontrak;

    /************METHOD**************/
    //konstruktor tanpa parameter
    public DosenTamu(){

    }
    
    //konstruktor dengam parameter
    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String NIDK, LocalDate akhirKontrak){
        super(NIP, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    //mengembalikan nidk
    public String getNIDK(){
        return this.NIDK;
    }

    //mengembalikan akhirKontrak
    public LocalDate getAkhirKontrak(){
        return this.akhirKontrak;
    }

    //mengeset nidk
    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    //mengeset akhir kontak
    public void setAkhirKontrak(LocalDate akhirKontrak){
        this.akhirKontrak = akhirKontrak;
    }

    //mengembalikan tunjangan
    public double getTunjangan(){
        return 0.025 * hitungMasaKerja().getYears() * getGajiPokok();
    }

    //printInfo
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Tanggal Akhir Kontrak: " + formatTanggal(akhirKontrak));
        System.out.println("Tunjangan: " + getTunjangan());
    }   
}



