package soal2;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari jari tabung: ");
        double jari2  = scanner.nextDouble();
        double r = jari2*jari2;
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = scanner.nextDouble();
        
        double volumeTabung = Math.PI*r*tinggi;
        System.out.println(volumeTabung); 
        
}
}
