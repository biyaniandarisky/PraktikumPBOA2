/* Nama File     : MataKuliah.java
 * Deskripsi     : berisi atribut dan method dalam class MataKuliah
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 2 Maret 2026
 */

public class MataKuliah{

/****************ATRIBUT***************/
    String idMatKul;
    String nama;
    int sks;

/******************METHOD**************/
    //konstruktor tanpa parameter
    public MataKuliah(){
        this("#", "#", 0);
    }

    //konstuktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //mengembalikan idMatkul
    public String getIdMatKul(){
        return this.idMatKul;
    }

    //mengembalikan nama
    public String getNama(){
        return this.nama;
    }

    //mengembalikan sks
    public int getSKS(){
        return this.sks;
    }

    //mengeset idMatKul
    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    //mengeset nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //mengeset sks
    public void setSks(int sks){
        this.sks = sks;
    }

    public void printMatKul(){
        System.out.println("idMatkul: " + idMatKul + ", mata kuliah: "+ nama + ", sks: " + sks);
    }
}