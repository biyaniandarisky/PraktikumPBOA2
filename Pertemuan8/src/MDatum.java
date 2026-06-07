public class MDatum {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        Anggora a1 = new Anggora();
        Kembangtelon k1 = new Kembangtelon();

        k.setBobot(3.5);
        a1.setBobot(4.2);
        k1.setBobot(5.1);

        Datum<Anabul> d1 = new Datum<>();
        Datum<Anabul> d2 = new Datum<>();
        Datum<Anabul> d3 = new Datum<>();
        Datum<Anabul> d4 = new Datum<>();

        d1.setIsi(k);
        d2.setIsi(a1);
        d3.setIsi(k1);
        d4.setIsi(new Anggora());

        d1.getIsi().gerak();
        d1.getIsi().bersuara();
        d2.getIsi().gerak();
        d2.getIsi().bersuara();
        d3.getIsi().gerak();
        d3.getIsi().bersuara();
        d4.getIsi().gerak();
        d4.getIsi().bersuara();
    }
}
