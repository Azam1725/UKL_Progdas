package soal3;

import java.util.Scanner;

public class no1 {
    public static double rata(double totalNilai, double jumlahsiswa){
        return totalNilai/jumlahsiswa;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa: ");
        int jumlahsiswa = scanner.nextInt();

        double[] nilaisiswa = new double[jumlahsiswa];
        for (int i = 0; i < jumlahsiswa; i ++) {
            System.out.println("Masukkan nilai siswa ke- "+(i+1)+":");
            nilaisiswa [i] = scanner.nextDouble();
        }
        double totalNilai = 0;
        for (double nilai:nilaisiswa){
            totalNilai += nilai;
        }
        double ratarata = rata(totalNilai, jumlahsiswa);
        System.out.println("rata rata nilai ujian: "+ratarata);

        
    }
}
