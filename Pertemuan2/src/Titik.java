/* Nama File     : Titik.java
 * Deskripsi     : berisi atribut dan method dalam class Titik
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 23 Februari 2026
 */

public class Titik {
    /********************ATRIBUT********************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /********************METHOD********************/
    //konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0,0);
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(counterTitik);
    }
    
    public int getKuadran() {
        if (this.absis > 0) {
            if (this.ordinat > 0) {
                return 1;
            }
            else {
                return 4;
            }
        }
        else {
            if (this.ordinat > 0) {
               return 2; 
            }
            else {
                return 3;
            }
        }
    }

    public double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(T.getAbsis() - absis, 2) + Math.pow(T.getOrdinat() - ordinat,2));
    }

    public void refleksiX() {
        ordinat = ordinat * -1;
    }

    public void refleksiY() {
        absis = absis * -1;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    public Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }
} //end class Titik