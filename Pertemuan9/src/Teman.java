/* Nama File     : Teman.java
 * Deskripsi     : berisi atribut dan method Teman
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 4 April 2026
 */
import java.util.*;
public class Teman {
    //atribut 
    private int nbelm;
    private List<String> Lnama;

    //konstruktor
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    //mengembalikan banyak elemen 
    public int getNbelm(){
        return this.nbelm;
    }
    
    //mengembalikan nama
    public String getNama(int indeks){
        return this.Lnama.get(indeks);
    }

    //mengeset nama
    public void setNama(int indeks, String nama){
        this.Lnama.set(indeks,nama);
    }

    //menambahkan nama
    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    //menghapus nama
    public void delNama(String nama){
        Lnama.remove(nama);
        nbelm--;
    }
    
    //apakah member
    public boolean isMember(String nama){
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)) {
                return true;
            }
        }
        return false;
    }

    //mengganti nama
    public void gantiNama(String nama, String namabaru){
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)){
                Lnama.set(i, namabaru);
            }
        }
    }

    //menghitung nama
    public int countNama(String nama){
        int count = 0;
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)) {
                count++;
            }
        }
    return count;
    }

    //menampilkan Teman
    public void showTeman(){
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println(getNama(i));
        }
    }
}
