import java.util.Scanner;
public class tugasKalkulator {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pilihan = -1;
        while (pilihan != 0) {
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("1. Hitung Faktorial. ");
            System.out.println("2. Hitung Perpangkatan. ");
            System.out.println("3. Peralian Matriks 2x2. ");
            System.out.println("0. Keluar. ");
            System.out.print("Pilih operasi (0-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungFaktorial();
                    break;
                case 2:
                    hitungPerpangkatan();
                    break;
                case 3:
                    perkalianMatriks();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan kalkulator sederhana.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        }
        public static void hitungFaktorial() {
            System.out.print("Masukkan angka untuk menghitung faktorial: ");
            int angka = input.nextInt();
            int hasil = 1;
            for (int i = 1; i <= angka; i++) {
                hasil = hasil * i;
            }
            System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
        }
        public static void hitungPerpangkatan() {
            System.out.print("Masukkan basis: ");
            int angka = input.nextInt();
            System.out.print("Masukkan eksponen: ");
            int eksponen = input.nextInt();
            int hasil = 1;
            for (int i = 0; i < eksponen; i++) {
                hasil = hasil * angka;
            }
            System.out.println(angka + " pangkat " + eksponen + " adalah: " + hasil);
        }
        public static void perkalianMatriks() {
            int[][] matriksA = new int[2][2];
            int[][] matriksB = new int[2][2];
            int[][] hasil = new int[2][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Masukkan elemen matriks A[" + i + "][" + j + "]: ");
                    matriksA[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("Masukkan elemen matriks B[" + i + "][" + j + "]: ");
                    matriksB[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    hasil[i][j] = matriksA[i][0] * matriksB[0][j] + matriksA[i][1] * matriksB[1][j];
                }
            }
            System.out.println("Hasil perkalian matriks A dan B:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(hasil[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
