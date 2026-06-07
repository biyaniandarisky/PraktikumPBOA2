import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        
        mahasiswa.put("2406123", "Adi");
        mahasiswa.put("2406124", "Bambang");

        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}
