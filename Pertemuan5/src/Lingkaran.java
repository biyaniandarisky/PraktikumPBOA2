/* Nama File     : Ligkaran.java
 * Deskripsi     : berisi atribut dan method dalam class Lingkaran
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 16 Maret 2026
 */
public class Lingkaran extends BangunDatar implements IResize{
    /************ATRIBUT***********/
    private double jari;

    /*****************METHOD*********/
    //konstruktor tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
    }

    //konstruktor dengan parameter
    public Lingkaran(double jari){
        setJmlSisi(1);
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

    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent / 100;
    }
}
