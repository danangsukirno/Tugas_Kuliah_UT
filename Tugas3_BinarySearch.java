import java.util.Scanner;

public class Tugas3_BinarySearch {

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

        // Data yang disediakan (sudah terurut)
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

        // Proses pencarian menggunakan binary search
        int indeks = binarySearch(data, 0, data.length - 1, nilaiCari);

        // Menampilkan hasil pencarian
        if (indeks != -1) {
            System.out.println("Nilai " + nilaiCari + " ditemukan pada indeks " + indeks+"\n");
        } else {
            System.out.println("Nilai " + nilaiCari + " tidak ditemukan dalam data.\n");
        }
    }

    // Metode binary search
    private static int binarySearch(int[] data, int low, int high, int nilaiCari) {
        if (high >= low) {
            int mid = (low + high) / 2;

            // Memeriksa nilai pada indeks tengah
            if (data[mid] == nilaiCari) {
                return mid;
            } else if (data[mid] > nilaiCari) {
                return binarySearch(data, low, mid - 1, nilaiCari);
            } else {
                return binarySearch(data, mid + 1, high, nilaiCari);
            }
        }

        return -1; // Nilai tidak ditemukan
    }
}
