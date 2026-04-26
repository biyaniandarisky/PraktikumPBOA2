/* Nama File     : Mahasiswaa.java
 * Deskripsi     : berisi atribut dan method Mahasiswaa
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
public class Mahasiswaa extends Civitasakademika {
    //atribut
    private String NIM;
    private Dosen dosenWali;

    //konstruktor
    public Mahasiswaa(String nama, String NIM, Dosen dosenWali){
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    //mengembalikan NIM
    public String getNIM(){
        return this.NIM;
    }

    //mengembalikan dosen wali
    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    //mengeset NIM(
    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    //mengeset dosen wali
    public void setWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    //override
    public String getNomor(){
        return this.NIM;
    }

    //menampilkan data mahasiswa
    public void tampilDataMahasiswa(){
        System.out.println("Nama = " + Nama);
        System.out.println("NIM = " + NIM);
        System.out.println("Dosen wali = " + dosenWali.getNama());
    }
}

