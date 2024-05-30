import java.util.Scanner;

public class Tugas3_SequentialSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Header Tugas
        System.out.println();
        System.out.println("Nama  : Danang Sukirno Hadiwardoyo");
        System.out.println("NIM   : 050428574");
        System.out.println("UPBJJ : Semarang");
        System.out.println();
        System.out.println("--------------------TUGAS 3--------------------");
        System.out.println("-----------------Struktur Data-----------------");
        System.out.println("--------------Universitas Terbuka--------------");
        System.out.println();
        //====================

        // Data yang disediakan
        int a1=10, a2=20, a3=30, a4=40, a5=50;
        int[] data = {a1, a2, a3, a4, a5};

        // Menampilkan data
        System.out.print("Data yang tersedia: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        // Meminta input nilai yang dicari
        System.out.println("\nMasukkan nilai yang ingin dicari: ");
        int nilaiCari = input.nextInt();

        // Proses pencarian menggunakan sequential search
        int indeks = -1; // Menginisialisasi indeks dengan -1 (belum ditemukan)
        for (int i = 0; i < data.length; i++) {
            if (data[i] == nilaiCari) {
                indeks = i;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (indeks != -1) {
            System.out.println("Nilai " + nilaiCari + " ditemukan pada indeks " + indeks+"\n");
        } else {
            System.out.println("Nilai " + nilaiCari + " tidak ditemukan dalam data.\n");
        }
    }
}
