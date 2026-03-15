/* Nama File     : Persegu.java
 * Deskripsi     : berisi atribut dan method dalam class Persegui
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 9 Maret 2026
 */
public class Persegi extends BangunDatar{
    /***********ATRIBUT**********/
    private double sisi;

    /*************METHOD***********/
    //konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    //konstruktor dengn parameter
    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border =border;
        this.sisi = sisi;
    }

    //mengembalikan sisi
    public double getSisi(){
        return sisi;
    }

    //mengeset sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    //mengembalikan luas
    public double getLuas(){
        return this.sisi * this.sisi;
    }

    //mengembalikan keliling
    public double getKeliling(){
        return this.sisi + this.sisi;
    }

    //mengembalikan diagonal
    public double getDiagonal(){
        return this.sisi * Math.sqrt(2);
    }

    //mengeprint
    public void printInfo(){
        System.out.println("Jumlah sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Sisi: " + getSisi());
    }
}
