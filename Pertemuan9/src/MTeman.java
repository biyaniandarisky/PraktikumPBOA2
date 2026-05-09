/* Nama File     : MTeman.java
 * Deskripsi     : berisi main class Teman
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 4 April 2026
 */
public class MTeman {
    public static void main(String[] args) {
        //kamus
        Teman T;

        //algoritma
        T = new Teman();

        T.addNama("Citra");
        T.addNama("Budi");
        T.addNama("Ani");
        T.addNama("Budi");

        T.showTeman();

        System.out.println("jumlah teman: " + T.getNbelm());
        System.out.println("nama indeks ke-1: " + T.getNama(1));
        T.setNama(1, "Doni");
        System.out.println("setelah ubah:");
        T.showTeman();
        System.out.println("apakah Budi member " + T.isMember("Budi"));
        System.out.println("jumlah nama budi: " + T.countNama("Budi"));
        T.gantiNama("Budi", "Eka");
        System.out.println("setelah ganti nama:");
        T.showTeman();
        T.delNama("Eka");
        System.out.println("setelah hapus satu elemen:");
        System.out.println("jumlah elemen akhir: " + T.getNbelm());
    }
}