/* Nama File     : Kendaraan.java
 * Deskripsi     : berisi atribut dan method dalam class Kendaraan
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 2 Maret 2026
 */

public class Kendaraan {
/*********ATRIBUT*******/
    private String noPlat;
    private String jenis;

/************METHOD***********/
    //konstruktor tanpa parameter
    public Kendaraan(){
        this("#", "motor");
    }

    //konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //mengembalikan noPlat
    public String getNoPlat(){
        return noPlat;
    }

    //mengembalikan jenis
    public String getJenis(){
        return jenis;
    }

    //mengeset noPlat
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    //mengeset jenis
    public void setJenis(String jenis){
        if (jenis == "motor" || jenis == "mobil"){
            this.jenis = jenis;
        }
    }

    //menampilkan kendaraan
    public void printKendaraan(){
        System.out.println("NoPlat: " + noPlat + ", jenis: " + jenis);
    }
}
