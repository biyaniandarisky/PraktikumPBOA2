/* Nama File     : MBangunDatar.java
 * Deskripsi     : main dari Bangun Datar
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 9 Maret 2026
 */
public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(5, "merah", "hitam");
        Lingkaran L1 = new Lingkaran(7, "coklat", "putih");

        P1.printInfo();
        L1.printInfo();
        // System.out.println("Sisi Persegi: " + P1.getSisi());
        // System.out.println("Warna Persegi: " + P1.getWarna());
        // System.out.println("Border Persegi: " + P1.getBorder());
        // System.out.println("Luas Persegi: " + P1.getLuas());
        // System.out.println("Keliling Persegi: " + P1.getKeliling());
        // System.out.println("Diagonal Persegi: " + P1.getDiagonal());
        // System.out.println("Sisi Lingkaran: " + L1.getJari());
        // System.out.println("Warna Lingkaran: " + L1.getWarna());
        // System.out.println("Border Lingkaran: " + L1.getBorder());
        // System.out.println("Luas Lingkaran: " + L1.getLuas());
        // System.out.println("Keliling Lingkaran: " + L1.getKeliling());
    }
    
}
