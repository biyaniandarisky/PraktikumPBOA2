/* Nama File     : MGaris.java
 * Deskripsi     : main class untuk menguji class Garis
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 23 Februari 2026
 */
public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis(new Titik(2,0),new Titik(0,4));
        Garis G2 = new Garis(new Titik(),new Titik(2,4));
        G1.printGaris();
        G2.printGaris();
        System.out.println("panjang : " + G1.panjang());
        System.out.println("gradien : " + G1.gradien());
        System.out.println("titik tengah : ");
        G2.TitikTengah().printTitik();
        System.out.println("sejajar : " + G1.isSejajar(G2));
        System.out.println("tegak lurus : " + G1.isTegakLurus(G2));
        System.out.println("jumlah Garis = " + Garis.getCounterGaris());
    }
}
