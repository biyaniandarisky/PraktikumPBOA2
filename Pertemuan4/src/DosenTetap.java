/* Nama File     : DosenTetap.java
 * Deskripsi     : berisi atribut dan method dalam class DosenTetap
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 15 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    /***********ATRIBUT*********/
    private String NIDN;
    private int BUP = 65;

    /************METHOD***********/
    //konstruktor tanpa parameter
    public DosenTetap(){

    }

    //konstruktor dengan parameter
    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String NIDN){
        super(NIP, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    //mengembalikan NIDN
    public String NIDN(){
        return this.NIDN;
    }

    //megeset NIDN
    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    //menghitung tunjangan
    public double getTunjangan(){
        return 0.02 * hitungMasaKerja().getYears() * getGajiPokok();
    }

    //menghitung kapan pensiun
    public LocalDate Pensiun(){
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    //print info
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + hitungMasaKerja().getYears() + " tahun " + hitungMasaKerja().getMonths() + " bulan");
        System.out.println("Tunjangan: " + getTunjangan());
    }

}
