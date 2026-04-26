/* Nama File     : Dosen.java
 * Deskripsi     : berisi atribut dan method Dosen
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
public class Dosen extends Civitasakademika{
    //atribut
    private String NIP;

    //konstruktor
    public Dosen(String nama, String NIP){
        super(nama);
        this.NIP = NIP;
    }

    //mengembalikan NIP
    public String getNIP(){
        return this.NIP;
    }

    //mengeset NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    //override
    public String getNomor(){
        return this.NIP;
    }
}
