public class sandal extends footwear{
    public int kode_sandal;

    @Override
    public void jenis() {
        System.out.println(namapemilik +" memiliki jenis footwear yaitu sandal dengan ukuran "+ukuran);
    }

    @Override
    public void merek() {
        System.out.println("Merek sandal: " + merek);
    }

    public void merek(int tahunProduksi) {
        System.out.println("Merek sandal: " + merek + ", Tahun Produksi: " + tahunProduksi);
    }

}