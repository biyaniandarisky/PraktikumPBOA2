/* Nama File     : Anabul.java
 * Deskripsi     : berisi atribut dan method Anabul
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 4 Mei 2026
 */
public class Anabul {
    //atribut
    private String panggilan;

    //method
    public Anabul(String nama){
        this.panggilan = nama;
    }
    
    void gerak(){
        System.out.println("kosong");
    }

    void bersuara(){
        System.out.println("kosong");
    }

    //mengembalikan nama
    public String getNama(){
        return this.panggilan;
    }

    //mengeset nama
    public void setNama(String nama){
        this.panggilan = nama;
    }
}
