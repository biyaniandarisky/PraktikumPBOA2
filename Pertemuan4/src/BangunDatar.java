/* Nama File     : BangunDatar.java
 * Deskripsi     : berisi atribut dan method dalam class Bangun Datar
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 9 Maret 2026
 */
public class BangunDatar {
    /*********ATRIBUT*********/
    protected int jmlSisi;
    protected String warna;
    protected String border;

    /***********METHOD***********/
    //konstruktor 
    public BangunDatar(){

    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }
    
    //mengembalikan jml sisi
    public int getJmlSisi(){
        return this.jmlSisi;
    }

    //mengeset jml sisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    //mengembalikan warna
    public String getWarna(){
        return this.warna;
    }

    //mengeset warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    //mengembalikn border
    public String getBorder(){
        return this.border;
    }

    //mengeset border
    public void setBorder(String border){
        this.border = border;
    }

    //mengeprint
    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
    }
}
