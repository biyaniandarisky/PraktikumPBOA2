/* Nama File     : Ligkaran.java
 * Deskripsi     : berisi atribut dan method dalam class Lingkaran
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 9 Maret 2026
 */
public class Lingkaran extends BangunDatar{
    /************ATRIBUT***********/
    private double jari;

    /*****************METHOD*********/
    //konstruktor tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
    }

    //konstruktor dengan parameter
    public Lingkaran(double jari, String warna, String border){
        super(1,warna,border);
        this.jari = jari;
    }

    //mengembalikan jari
    public double getJari(){
        return jari;
    }

    //mengeset jari
    public void setJari(double jari){
        this.jari = jari;
    }

    //mengembalikan luas
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    //mengembalikan keliling
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    //mengeprint
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari jari: " + getJari());
    }
}
