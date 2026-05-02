/* Nama File     : Kucing.java
 * Deskripsi     : berisi atribut dan method Kucing
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 27 April 2026
 */
public class Kucing extends Anabul{

    //atribut
    private double bobot;
    
    //method
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
