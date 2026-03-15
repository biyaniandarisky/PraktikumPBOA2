/* Nama File     : MPegawai.java
 * Deskripsi     : berisi main dari class Pegawai
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 15 Maret 2026
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dTetap = new DosenTetap(
            "9545647548",
            "Andi",
            LocalDate.of(1990,5,5),
            LocalDate.of(2015,1,1),
            5000000.0,
            "Fakultas Sains dan Matematika",
            "78647324"
        );

        DosenTamu dTamu = new DosenTamu(
            "9876543210",                 
            "Budi",                      
            LocalDate.of(1985,3,10),      
            LocalDate.of(2022,8,1),       
            4500000.0,                    
            "Fakultas Teknik",        
            "99887766",              
            LocalDate.of(2026,12,31)      
        );

        Tendik tendik1 = new Tendik(
            "1234567890",
            "Siti",
            LocalDate.of(1992,7,15),
            LocalDate.of(2018,2,1),                3500000,
            "Akademik"
        );

        // ===== OUTPUT =====
        System.out.println("===== DATA DOSEN TETAP =====");
        dTetap.printInfo();

        System.out.println("\n===== DATA DOSEN TAMU =====");
        dTamu.printInfo();

        System.out.println("\n===== DATA TENAGA KEPENDIDIKAN =====");
        tendik1.printInfo();

    }
}
