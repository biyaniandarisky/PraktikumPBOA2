class Data<T> {

    // atribut
    private Object[] ruang = new Object[100];
    private int banyak = 0;

    // method
    public T getIsi(int index) {
        return (T) ruang[index];
    }

    public void setIsi(int index, T isi) {
        ruang[index] = isi;
        if (index >= banyak) {
            banyak = index + 1;
        }
    }

    public int getSize() {
        return banyak;
    }
}