public class Garis {
/* Nama File     : Garis.java
 * Deskripsi     : berisi atribut dan method dalam class Garis
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 27 Februari 2026
 */

    /********************ATRIBUT********************/
    private Titik awal;
    private Titik akhir;
    private static int counterGaris = 0;

    /********************METHOD********************/
    //konstruktor untuk membuat titik (0,0) ke (1,1)
    public Garis(){
        this(new Titik(0,0), new Titik(1,1));
    }

    //konstruktor dengan inputan
    public Garis(Titik awal, Titik akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    public static int getCounterGaris(){
        return counterGaris;
    }

    //mengembalikan titik awal
    public Titik getTitikAwal(){
        return this.awal;
    }

    //mengembalikan titik akhir
    public Titik getTitikAkhir(){
        return this.akhir;
    }

    //mengeset titik awal
    public void setTitikAwal(Titik awal){
        this.awal = awal;
    }

    //mengeset titik akhir
    public void setTitikAkhir(Titik akhir){
        this.akhir = akhir;
    }

    //panjang garis
    public double panjang(){
        return Math.sqrt(Math.pow(akhir.getAbsis() - awal.getAbsis(), 2) + Math.pow(akhir.getOrdinat() - akhir.getOrdinat(), 2));
    }

    //gradien
    public double gradien(){
        return (akhir.getOrdinat() - akhir.getOrdinat())/(akhir.getAbsis() - awal.getAbsis());
    }

    //titik tengah
    public Titik TitikTengah(){
        return new Titik((awal.getAbsis() + akhir.getAbsis()) / 2, (awal.getOrdinat() - akhir.getOrdinat()) / 2);
    }

    //apakah sejajar
    public boolean isSejajar(Garis G){
        return this.gradien() == G.gradien();
    }

    //apakah tegak lurus
    public boolean isTegakLurus(Garis G){
        return this.gradien() * G.gradien() == - 1;
    }

    //menampilkan titik awal dan titik akhir
    public void printGaris(){
        System.out.println(
        "Titik Awal : (" + awal.getAbsis() + "," + awal.getOrdinat() + ") " +
        "Titik Akhir : (" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")"
        );
    }

    //menampilkan persamaan garis
    public String getPersamaanGaris() {
        double m = gradien();
        if (m == Double.POSITIVE_INFINITY) {
            return "x = " + awal.getAbsis();
        }
        double c = awal.getOrdinat() - m * awal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
