/* Nama File     : Kucing.java
 * Deskripsi     : berisi atribut dan method Kucing
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 4 Mei 2026
 */
public class Kucing extends Anabul{

    //atribut
    private double bobot;
    
    //method
    public Kucing(String nama,double bobot){
        super(nama);
        this.bobot = bobot;
    }
    public double getBobot(){
        return this.bobot;
    }
    public void setBobot(double bobot){
        this.bobot = bobot;
    }
    void gerak(){
        System.out.println("gerak kucing melataa");
    }

    void bersuara(){
        System.out.println("suara kucing meongg");
    }

}
