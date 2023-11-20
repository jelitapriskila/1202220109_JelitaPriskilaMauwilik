public class sepatu extends footwear {
    public int kode_sepatu;

    @Override
    public void jenis() {
        System.out.println(namapemilik +" memiliki jenis footwear yaitu sepatu dengan ukuran "+ukuran);
    }

    @Override
    public void merek() {
        System.out.println("Merek sepatu: " +merek);
    }

    public void jenis(String tipeSepatu) {
        System.out.println(namapemilik + " memiliki jenis sepatu yaitu " + tipeSepatu + " dengan ukuran " + ukuran);
    }

}