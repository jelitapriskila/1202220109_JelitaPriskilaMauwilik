import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {

        String nama, nim;
        double n_quiz, n_tugas, n_uts, n_uas, n_tubes;
            Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIM : ");
        nim = input.nextLine();
        System.out.print("Nilai quiz : ");
        n_quiz = input.nextInt();
        System.out.print("Nilai tugas : ");
        n_tugas = input.nextInt();
        System.out.print("Nilai uts : ");
        n_uts = input.nextInt();
        System.out.print("Nilai uas : ");
        n_uas = input.nextInt();
        System.out.print("Nilai Tubes : ");
        n_tubes = input.nextInt();
        input.close();
        double n_akhir = (0.10 * n_quiz + 0.10 * n_tugas + 0.25 * n_uts + 0.25 * n_uas) + 0.30 * n_tubes;

        System.out.println(nama+" dengan Nim "+nim+" Nilai Mata kuliah Pemrograman Berorientasi Objek: " + n_akhir);
    }
}