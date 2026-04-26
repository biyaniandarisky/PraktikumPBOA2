/* Nama File     : MSeminar.java
 * Deskripsi     : main Seminar
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
public class MSeminar {
    public static void main(String[] args) {
        Seminar s = new Seminar();

        Dosen d1 = new Dosen("Pak Budi", "1987001");
        Dosen d2 = new Dosen("Bu Rini", "1987002");
        Mahasiswaa m1 = new Mahasiswaa("Andi", "24001", d1);
        Mahasiswaa m2 = new Mahasiswaa("Sinta", "24002", d1);
        Mahasiswaa m3 = new Mahasiswaa("Raka", "24003", d2);
        Mahasiswaa m4 = new Mahasiswaa("Dina", "24004", d2);
        Mahasiswaa m5 = new Mahasiswaa("Fajar", "24005", d1);

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Jumlah peserta seminar = " + s.countPeserta());
        s.tampilPeserta();
        System.out.println("Jumlah mahasiswa = " + s.countMahasiswa());
        m1.setWali(d2);
        System.out.println("Dosen wali baru m1  = " + m1.getDosenWali().getNama());
        m2.tampilDataMahasiswa();
    }
}