import java.util.LinkedList;

public class Tugas1 {
    public static void main(String[] args) {
        //Header Tugas
        System.out.println();
        System.out.println("Nama  : Danang Sukirno Hadiwardoyo");
        System.out.println("NIM   : 050428574");
        System.out.println("UPBJJ : Semarang");
        System.out.println();
        System.out.println("--------------------TUGAS 1--------------------");
        System.out.println("-----------------Struktur Data-----------------");
        System.out.println("--------------Universitas Terbuka--------------");
        System.out.println();
        //====================
        //Soal nomor 1
        System.out.println("Soal nomor 1:");
        System.out.println("Mendeklarasikan integer \"jumlahBaris\" ");
        int jumlahBaris;
        System.out.println();
        //====================
        //Soal nomor 2
        System.out.println("Soal nomor 2:");
        String kalimatBaru = "Deklarasi tipe data String";
        System.out.println(kalimatBaru);
        System.out.println();
        //====================
        //Soal nomor 3
        System.out.println("Soal nomor 3:");
        int[] empatAngka = {07,10,20,23};
        for (int i=0;i<4;i++){
            System.out.print(empatAngka[i]);
            if(i<3) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        System.out.println();
        //=====================
        //Soal nomor 4
        System.out.println("Soal nomor 4:");
        String[][] alfabet = {
            {"p","s","n"},
            {"w","l","b"},
            {"f","r","e"}
        };
        for (int i=0;i<alfabet.length;i++){
            for (int j=0;j<alfabet[i].length;j++){
                System.out.print(alfabet[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        //====================
        //Soal nomor 5
        System.out.println("Soal nomor 5:");
        LinkedList<String> listAngka = new LinkedList<>();
        listAngka.add("26");
        listAngka.add("08");
        listAngka.add("23");
        listAngka.add("24");
        listAngka.add("16");
        System.out.println(listAngka);
    }
}