/* Nama File     : Persegu.java
 * Deskripsi     : berisi atribut dan method dalam class Persegui
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 16 Maret 2026
 */
public class Persegi extends BangunDatar implements IResize{
    /***********ATRIBUT**********/
    private double sisi;

    /*************METHOD***********/
    //konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    //konstruktor dengn parameter
    public Persegi(double sisi){
        this.jmlSisi = 4;
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

@Override
public void zoomIn(){
    sisi = sisi * 1.1;
}

@Override
public void zoomOut(){
    sisi = sisi * 0.9;
}

@Override
public void zoom(int percent){
    sisi = sisi * percent / 100;
}
}
