/* Nama File     : IRezise.java
 * Deskripsi     : berisi method dalam interface IRezise
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 16 Maret 2026
 */

public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
