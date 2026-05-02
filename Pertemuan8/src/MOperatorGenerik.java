public class MOperatorGenerik {
    public static void main(String[] args) {
        Datum<Integer> a = new Datum<>();
        Datum<Integer> b = new Datum<>();
        Datum<String> c = new Datum<>();
        Datum<String> d = new Datum<>();
        Datum<Anabul> e = new Datum<>();
        Datum<Anabul> f = new Datum<>();

        a.setIsi(3);
        b.setIsi(6);
        c.setIsi("semut");
        d.setIsi("kura");
        e.setIsi(new Kembangtelon());
        f.setIsi(new Anggora());

        OperatorGenerik <Integer> opInt = new OperatorGenerik<>();
        opInt.Tukar(a, b);
        System.out.println("a = " + a.getIsi());
        System.out.println("b = " + b.getIsi());

        OperatorGenerik<String> opStr = new OperatorGenerik<>();
        opStr.Tukar(c, d);
        System.out.println("c = " + c.getIsi());
        System.out.println("d = " + d.getIsi());

        OperatorGenerik<Anabul> opAnb = new OperatorGenerik<>();
        opAnb.Tukar(e, f);
        System.out.println("e = " );
        e.getIsi().gerak();
        System.out.println("f = ");
        f.getIsi().gerak();
    }
}
