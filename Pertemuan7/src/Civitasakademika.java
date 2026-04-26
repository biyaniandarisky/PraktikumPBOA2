/* Nama File     : Civitasakademika.java
 * Deskripsi     : berisi atribut dan method Civitasakademika
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
public class Civitasakademika {
    //atribut
    protected String Nama;

    //konstruktor
    public Civitasakademika(String Nama){
        this.Nama = Nama;
    }

    //mengembalikan nama
    public String getNama(){
        return this.Nama;
    }

    //mengeset nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //mengembalikan nomor
    public String getNomor(){
        return "-";
    }
}
