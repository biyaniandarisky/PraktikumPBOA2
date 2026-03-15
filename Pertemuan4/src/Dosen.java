/* Nama File     : Dosen.java
 * Deskripsi     : berisi atribut dan method dalam class Dosen
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 15 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai{
    /*****************ATRIBUT**********/
    private String fakultas;

    /********METHOD******************/
    //konstruktor tanpa parameter
    public Dosen(){

    }

    //konstruktor dengan parameter
    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(NIP,nama,tanggalLahir,tmt,gajiPokok);
        this.fakultas = fakultas;
    }

    //mengembalikan fakultas
    public String getFakultas(){
        return this.fakultas;
    }

    //mengeset fakultas
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
}
