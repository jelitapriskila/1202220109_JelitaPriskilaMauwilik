public class main {
    public static void main (String[] args) {
        sepatu pemilik_01 = new sepatu();
        pemilik_01.namapemilik = "Jelita";
        pemilik_01.ukuran = 38;
        pemilik_01.merek = "Starz";
        pemilik_01.jenis();
        pemilik_01.jenis("sneaker");
	    pemilik_01.merek();

        sandal owner_01 = new sandal();
        owner_01.namapemilik = "Priskila";
        owner_01.ukuran = 39;
        owner_01.merek = "Moon";
        owner_01.jenis();
        owner_01.merek();
        owner_01.merek(2023);
    }
}

