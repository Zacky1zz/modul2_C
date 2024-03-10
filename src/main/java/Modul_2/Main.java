package Modul_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mahasiswa.tampilUniversitas();
        Mahasiswa mahasiswa1 = inputMahasiswa();
        mahasiswa1.tampilDataMahasiswa();
    }

    static Mahasiswa inputMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        String nim = cekNIM();

        System.out.print("Masukkan Jurusan Mahasiswa: ");
        String jurusan = scanner.nextLine();

        return new Mahasiswa(nama, nim, jurusan);
    }

    static String cekNIM() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan NIM Mahasiswa (panjang 15 digit): ");
            String nim = scanner.nextLine();

            if (nim.length() == 15 && nim.matches("\\d+")) {
                return nim;
            } else {
                System.out.println("NIM harus terdiri dari 15 digit angka. Silakan coba lagi.");
            }
        }
    }
}