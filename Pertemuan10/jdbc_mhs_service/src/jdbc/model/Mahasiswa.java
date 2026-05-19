package jdbc.model;

/**
 * Nama : Biyani Andarisky Maratia
 * File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method kelas Mahasiswa
 */

public class Mahasiswa {
    //atribut
    private int id;
    private String nama;
    
    //konstruktor
    public Mahasiswa(){
        
    }
    
    public Mahasiswa(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    //getter dan setter
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa {" + "id=" + id + ", nama=" + nama + "}";
    }
}
