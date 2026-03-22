/* Nama File     : MBangunDatar.java
 * Deskripsi     : berisi main dari class Bangun Datar
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 16 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        System.out.println("keliling persegi : " + P1.getKeliling());
        System.out.println("keliling persegi : " + P2.getKeliling());
        System.out.println("luas lingkaran : " + L1.getLuas());
        System.out.println("luas lingkaran : " + L2.getLuas());
        System.out.println("IsEqual : " + L1.isEqualLuas(L2));

        P2.zoomIn();
        System.out.println("zoom in : " + P2.getSisi());
        L2.zoomOut();
        System.out.println("zoom out : " + L2.getJari());
    }
}
