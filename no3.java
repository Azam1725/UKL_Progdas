package soal3;

import java.util.Scanner;

public class no3 {
     public static void main(String[] args) {
        Scanner azam = new Scanner(System.in);

        System.out.print("Masukkan jumlah Array: ");
        int n = azam.nextInt();
        int[] array = new int[n];
        boolean[] azamm = new boolean[n];
        System.out.println("Masukkan elemen Array:");
        for (int i = 0; i < n; i++) {
            array[i] = azam.nextInt();
        }

        System.out.println("Frekuensi elemen dalam array:");
        for (int i = 0; i < n; i++) {
            if (!azamm[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        azamm[j] = true;
                    }
                }
                System.out.println(array[i] + " muncul " + count + " kali");
            }
        }

        azam.close();
    }


}
