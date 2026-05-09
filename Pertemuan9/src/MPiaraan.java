/* Nama File     : MPiaraan.java
 * Deskripsi     : berisi main class Piaraan
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 9 April 2026
 */

public class MPiaraan {
    public static void main(String[] args) {
        //kamus
        Piaraan P;
        Kucing K1,K2;
        Anjing A1,A2;

        //algoritma
        P = new Piaraan();
        K1 = new Kucing("pus", 3.5);
        K2 = new Kucing("kitty", 2.0);
        A1 = new Anjing("doggy");
        A2 = new Anjing("guk");

        P.enqueueAnabul(K1);
        P.enqueueAnabul(A1);
        P.enqueueAnabul(A2);
        P.enqueueAnabul(K2);

        P.showAnabul();
        P.showJenisAnabul();
        System.out.println("banyak elemen : " + P.getNbelm());
        System.out.println("apakah kucing anabul? " + P.isMember(K1));
        System.out.println("data anabul pertama : " + P.getAnabul());
        System.out.println("banyak kucing : " + P.countKucing());
        System.out.println("bobot total kucing : " + P.bobotKucing());
        System.out.println("dequeue : " + P.dequeueAnabul().getNama());
        
    }
}
