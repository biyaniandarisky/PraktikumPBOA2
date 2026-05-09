/* Nama File     : Piaraan.java
 * Deskripsi     : berisi atribut dan method Piaraan
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 9 April 2026
 */

import java.util.*;
public class Piaraan {
    //atribut
    private int nbelm;
    private Queue<Anabul> Lanabul; 

    //konstruktor
    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    //mengembalikan banyak elemen
    public int getNbelm(){
        return this.nbelm;
    }

    //menambah elemen akhir
    public void enqueueAnabul(Anabul A){
        Lanabul.add(A);
        nbelm++;
    }

    //apakah member
    public boolean isMember(Anabul anabul){
        for (Anabul x : Lanabul) {
            if (x.getNama().equals(anabul.getNama())) {
                return true;
            }
        }
        return false;
    }

    //mengambil data anabul pertama dalam antrean
    public Anabul getAnabul(){
        return Lanabul.peek();
    }

    //mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll(); // ambil + hapus
        }
        return null;
    }

    //menampilkan nama panggilan anabul
    public void showAnabul(){
        for (Anabul a : Lanabul){
            System.out.println(a.getNama());
        }
    }

    //menghitung banyak kucing
    public int countKucing(){
        int count = 0;
        for(Anabul k : Lanabul){
            if (k instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    //menghitung bobot kucing
    public double bobotKucing(){
        int berat = 0;
        for(Anabul k : Lanabul){
            if (k instanceof Kucing){
                berat += ((Kucing)(k)).getBobot();
            }
        }
        return berat;
    }

    //menampilkan nama panggilan para anabul dengan jenisnya
    public void showJenisAnabul(){
        for (Anabul a : Lanabul){
            System.out.println(a.getClass().getName());
        } 
    }
}
