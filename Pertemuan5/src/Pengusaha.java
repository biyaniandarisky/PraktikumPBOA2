/* Nama File     : Pengusaha.java
 * Deskripsi     : berisi atribut dan method dalam class Pengusaha
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 22 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    /**********ATRIBUT*****************/
    private String npwp;
    private static int counterPengusaha = 0;

    /***********METHOD*******************/
    //konstruktor tanpa parameter
    public Pengusaha(){

    }

    //konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl, String alamat, double pendapatan, String npwp){
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //mengembalikan npwp
    public String getNpwp(){
        return npwp;
    }

    //mengembalikan jumlah pengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    //mengeset npwp
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    //menghitung masa kerja
    @Override
    public int hitungMasaKerja(){
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + 7;
    }

    //menghitung pajak
    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    //printinfo
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}
