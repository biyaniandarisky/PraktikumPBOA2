/* Nama File     : MMahasiswa.java
 * Deskripsi     : main Mahasiswa
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
public class MMahasiswa {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("001", "Andi");
        m1.setProgramStudi();
        m1.printInfo();

        Mahasiswa m2 = new Mahasiswa("002", "Budi");
        m2.setProgramStudi("Informatika");
        m2.printInfo();

        Mahasiswa m3 = new Mahasiswa("003", "Citra");
        m3.setProgramStudi(m2);
        m3.printInfo();

        // c = konstruktor tanpa parameter
        Mahasiswa m4 = new Mahasiswa();
        m4.printInfo();

        // d = konstruktor 3 parameter
        Mahasiswa m5 = new Mahasiswa("005", "Dina", "Sistem Informasi");
        m5.printInfo();

        // e = konstruktor cloning
        Mahasiswa m6 = new Mahasiswa(m5);
        m6.printInfo();
    }
}