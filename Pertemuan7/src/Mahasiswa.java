/* Nama File     : Mahasiswa.java
 * Deskripsi     : berisi atribut dan method Mahasiswa
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
class Mahasiswa {
    private String NIM;
    private String Nama;
    private String ProgramStudi;

    // Konstruktor
    Mahasiswa(){
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = "Kosong";
    }

    Mahasiswa(String NIM, String Nama, String programStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = programStudi;
    }

    Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    //mengembalikan nilai nim
    public String getNIM() {
        return NIM;
    }

    //mengembalikan nama
    public String getNama() {
        return Nama;
    }

    //mengembalikan program studi
    public String getProgramStudi() {
        return ProgramStudi;
    }

    //mengeset nim
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    //mengeset nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    //mengeset proram studi
    public void setProgramStudi() {
        this.ProgramStudi = "Kosong";
    }


    public void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.getProgramStudi(); 
    }

    public void printInfo() {
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Program Studi : " + ProgramStudi);
    }
}