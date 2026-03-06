/* Nama File     : Dosen.java
 * Deskripsi     : berisi atribut dan method dalam class Dosen
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 2 Maret 2026
 */

public class Dosen {
/***************ATRIBUT*********** */
    private String NIP;
    private String nama;
    private String prodi;

/***************METHOD***************/
    //konstruktor tanpa parameter
    public Dosen(){
        this("#", "#", "#");
    }

    //konstruktor dengan parameter
    public Dosen(String NIP, String nama, String prodi){
        this.NIP = NIP;
        this.nama = nama;
        this. prodi = prodi;
    }

    //mengembalikan NIP
    public String getNIP(){
        return NIP;
    }

    //mengembalikan nama
    public String getNama(){
        return nama;
    }

    //mengembalikan prodi
    public String getProdi(){
        return prodi;
    }

    //mengeset NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    //mengeset nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //mengeset prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //menampilkan dosen
    public void printDosen(){
        System.out.println("NIP: " + NIP + ", nama: " + nama + ", prodi: " + prodi);
    }
}

