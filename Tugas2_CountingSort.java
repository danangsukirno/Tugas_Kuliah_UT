import java.util.Arrays;

public class Tugas2_CountingSort {

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
        System.out.println("\nDiurutkan dengan menggunakan algoritma counting-sort");

        data = countingSort(data);
        System.out.println("\nData terurut: " + Arrays.toString(data));
        System.out.println();
    }

    private static int[] countingSort(int[] data) {
        int maksimal = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > maksimal) {
                maksimal = data[i];
            }
        }

        int[] hitung = new int[maksimal + 1];
        for (int i = 0; i < data.length; i++) {
            hitung[data[i]]++;
        }

        int k = 0;
        for (int i = 0; i <= maksimal; i++) {
            while (hitung[i] > 0) {
                data[k++] = i;
                hitung[i]--;
            }
        }

        return data;
    }
}