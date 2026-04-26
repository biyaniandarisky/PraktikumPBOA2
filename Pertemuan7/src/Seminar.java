/* Nama File     : Seminar.java
 * Deskripsi     : berisi atribut dan method Seminar
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
class Seminar {

    //atribut
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    //konstruktor
    public Seminar() {
        pesertas = new Civitasakademika[100];
        banyakPeserta = 0;
    }

    // registrasi peserta
    public void registrasi(Civitasakademika p) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = p; 
            banyakPeserta++;
        } else {
            System.out.println("Peserta penuh!");
        }
    }

    // menghitung jumlah peserta
    public int countPeserta() {
        return banyakPeserta;
    }

    //menampilkan peserta
    public void tampilPeserta(){
        for (int i=0; i < banyakPeserta; i++){
            System.out.println(pesertas[i].getNomor() + " " + pesertas[i].getNama());
        }
    }

    //menghitung banyak mahasiswa
    public int countMahasiswa() {
    int jumlah = 0;
    for (int i = 0; i < banyakPeserta; i++) {
        if (pesertas[i] instanceof Mahasiswaa) {
            jumlah++;
        }
    }
    return jumlah;
}
}