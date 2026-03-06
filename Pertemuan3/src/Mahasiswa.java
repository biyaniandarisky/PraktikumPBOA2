/* Nama File     : Kendaraan.java
 * Deskripsi     : berisi atribut dan method dalam class Kendaraan
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 2 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
/*********ATRIBUT*********/ 
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

/**********METHOD***********/
    //konstruktor tanpa parameter
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    //konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    //mengembalikan nim
    public String getNim(){
        return this.nim;
    }

    //mengembalikan nama
    public String getNama(){
        return this.nama;
    }

    //mengembalikan prodi
    public String getProdi(){
        return this.prodi;
    }

    //mengembalikan dosen wali
    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    //mengembalikan kendaraan
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    //mengeset nim
    public void setNim(String nim){
        this.nim = nim;
    }

    //mengeset nama
    public void setNama(String nama){
        this.nama = nama;
    }
    
    //mengeset prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //mengeset dosen wali
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    //mengeset kendaraan
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    
    //menambahkan sebuah mata kuliah ke atribut listMatKul
    public void addMatkul(MataKuliah newMatKul){
        listMatkul.add(newMatKul);
    }

    //mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int jmlSks = 0;
        for (MataKuliah matkul : listMatkul) {
                jmlSks += matkul.getSKS();
        }
        return jmlSks;
    }

    //mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
      return listMatkul.size();
    }

    //menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("nim" + this.nim);
        System.out.println("nama" + this.nama);
        System.out.println("prodi" + this.prodi);
    }

    //menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa.
    public void printDetailMhs(){
        System.out.println("nim: " + this.nim);
        System.out.println("nama: " + this.nama);
        System.out.println("prodi: " + this.prodi);
        System.out.println("mata kuliah:");
        for (int i = 0; i < listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("dosen wali: " + dosenWali.getNama());
        System.out.println("kendaraan: " + kendaraan.getJenis());
    }
}//end class mahasiswa

