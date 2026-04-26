/* Nama File     : MAnabul.java
 * Deskripsi     : main Anabul
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
public class MAnabul {
    public static void main(String[] args) {
        Anabul K = new Kucing();
        Anabul A = new Anjing();
        Anabul B = new Burung();

        K.bersuara();
        A.bersuara();
        B.bersuara();
        K.gerak();
        A.gerak();
        B.gerak();
    }
}
