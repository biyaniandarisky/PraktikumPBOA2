/* Nama File     : MTitik.java
 * Deskripsi     : main class untuk menguji class Titik
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();    // Membuat objek titik T1 (0,0)
        T1.setAbsis(3);         // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);       // mengubah ordinat T1 dengan nilai 4
        T1.printTitik();          // mencetak koordinat T1 ke layar
        T1.geser(3, 4);      // menggeser T1 sejauh (3,4)
        T1.printTitik();          // menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = T1;

        T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T2 = new Titik(3,5); //Membuat objek titik T2 (3,5)
        T3 = new Titik(1,4); //Membuat objek titik T2 (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik()); //tidak bisa, harus static
        System.out.println("Kuadran = " + T2.getKuadran());
        System.out.println("Jarak Pusat = " + T2.getJarakPusat());
        System.out.println("Jarak Antar Titik = " + T2.getJarak(T3));
        T2.refleksiX();
        System.out.println("Refleksi X T2 = ");
        T2.printTitik();
        T2.refleksiY();
        System.out.println("Refleksi Y T2 = ");
        T2.printTitik();
        System.out.println("Refleksi X T3 : ");
        T3.getRefleksiX().printTitik();
        System.out.println("Refleksi Y T3 : ");
        T3.getRefleksiY().printTitik();

    }
}