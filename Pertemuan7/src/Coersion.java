/* Nama File     : Coersion.java
 * Deskripsi     : berisi beberapa percobaan pergantian tipe data 
 * Pembuat       : Biyani Andarisky Maratia
 * Tanggal       : 26 April 2026
 */
public class Coersion {
    public static void main(String[] args) {
        // a. 
        int nilai = 65;
        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + (char) nilai);
        System.out.println("Double: " + (double) nilai);

        String angkaStr = "123";
        System.out.println("String ke int: " + Integer.parseInt(angkaStr));
        System.out.println("String ke double: " + Double.parseDouble(angkaStr));
        System.out.println("Int ke String: " +  Integer.toString(nilai));

        // b.
        int nilaiInt = 65;
        double nilaiDouble = (double) nilaiInt;
        int nilaiIntBaru = (int) nilaiDouble;

        System.out.println("Nilai awal (int): " + nilaiInt);
        System.out.println("Ke double: " + nilaiDouble);
        System.out.println("Balik ke int: " + nilaiIntBaru);

        // c.
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S : " + S);
        System.out.println("Z : " + Z);

        // d. 
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q; 
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R : " + R);
        System.out.println("D : " + D);

        // e.
        int A = Integer.parseInt(S);
        System.out.println("A (S ke int): " + A);
        
        // f.
        String T = Integer.toString(A);
        System.out.println("T (A ke String): " + T);
    }
}