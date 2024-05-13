import java.util.Arrays;

public class Tugas2_MergeSort {

    public static void main(String[] args) {
        //Header Tugas
        System.out.println();
        System.out.println("Nama  : Danang Sukirno Hadiwardoyo");
        System.out.println("NIM   : 050428574");
        System.out.println("UPBJJ : Semarang");
        System.out.println();
        System.out.println("--------------------TUGAS 2--------------------");
        System.out.println("-----------------Struktur Data-----------------");
        System.out.println("--------------Universitas Terbuka--------------");
        System.out.println();
        //====================
        int nilai1 = 5, nilai2 = 2, nilai3 = 4;
        int nilai4 = 1, nilai5 = 6, nilai6 = 3;
        int[] data = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};
        System.out.println("Data awal: " + Arrays.toString(data));
        System.out.println("\nDiurutkan dengan menggunakan algoritma merge-sort");

        data = mergeSort(data);

        System.out.println("\nData terurut: " + Arrays.toString(data));
        System.out.println();
    }

    private static int[] mergeSort(int[] data) {
        if (data.length == 1) {
            return data;
        }

        int tengah = data.length / 2;
        int[] kiri = Arrays.copyOfRange(data, 0, tengah);
        int[] kanan = Arrays.copyOfRange(data, tengah, data.length);

        kiri = mergeSort(kiri);
        kanan = mergeSort(kanan);

        return merge(kiri, kanan);
    }

    private static int[] merge(int[] kiri, int[] kanan) {
        int[] hasil = new int [kiri.length + kanan.length];
        int i = 0, j = 0, k = 0;

        while (i < kiri.length && j < kanan.length) {
            if (kiri[i] <= kanan[j]) {
                hasil[k++] = kiri[i++];
            } else {
                hasil[k++] = kanan[j++];
            }
        }

        while (i < kiri.length) {
            hasil[k++] = kiri[i++];
        }

        while (j < kanan.length) {
            hasil[k++] = kanan[j++];
        }

        return hasil;
    }
}
