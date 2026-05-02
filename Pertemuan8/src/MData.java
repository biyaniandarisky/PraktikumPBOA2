public class MData {
    public static void main(String[] args) {
        Data<Anabul> d = new Data<>();

        d.setIsi(1, new Kucing());
        d.setIsi(2, new Anggora());
        d.setIsi(3, new Kembangtelon());

        for (int i = 1; i < d.getSize(); i++) {
            System.out.println(i);
            d.getIsi(i).gerak();
            d.getIsi(i).bersuara();
        }

        System.out.println("banyak objek = " + d.getSize());
    }
}
