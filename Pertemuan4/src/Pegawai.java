/* Nama File     : Pegawai.java
 * Deskripsi     : berisi atribut dan method dalam class Pegawai
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    /*********ATRIBUT***********/
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;

    /**************METHOD*********/
    //konstruktor tanpa parameter
    public Pegawai(){

    }
    
    //konstruktor dengan parameter
    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    //mengembalikan nip
    public String getNIP(){
        return this.NIP;
    }

    //mengembalikan nama
    public String getNama(){
        return this.nama;
    }

    //mengembalikan tanggal lahir
    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    //mengembalikan tmt
    public LocalDate getTmt(){
        return this.tmt;
    }

    //mengembalikan gaji pokok
    public double getGajiPokok(){
        return this.gajiPokok;
    }

    //mengeset nip
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    //mengeset nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //mengeset tanggal lahir
    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    //mengeset tmt
    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    }

    //mengeset gaji pokok
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    //menghitung masa kerja
    public Period hitungMasaKerja(){
        return Period.between(tmt, LocalDate.now());
    }

    //memformat tanggal
    public String formatTanggal(LocalDate date){

        String[] bulan = {
            "Januari","Februari","Maret","April","Mei","Juni",
            "Juli","Agustus","September","Oktober","November","Desember"
        };

        return date.getDayOfMonth() + " " +
            bulan[date.getMonthValue()-1] + " " +
            date.getYear();
    }

    //printInfo
    public void printInfo(){
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT : " + formatTanggal(getTmt()));
        System.out.println("Gaji Pokok : Rp " + getGajiPokok());
    }
}
