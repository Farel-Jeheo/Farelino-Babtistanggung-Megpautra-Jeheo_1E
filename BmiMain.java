/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmii;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class BmiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("||||Selamat Datang||||");
        System.out.println("Jenis Kelamin: ");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.println("Masukan pilihan jenis kelamin anda (1/2) : ");
        int pilihanKelamin = input.nextInt();
        
        System.out.println("Masukan Tinggi badan anda : ");
        float tinggi = input.nextFloat();
        
        System.out.println("Masukan Berat badan anda : ");
        float berat = input.nextFloat();
        
        Bmii Bmiapp = new Bmii(berat , tinggi);
        
        Bmiapp.getHasil(pilihanKelamin);
        
        input.close();
    }
}
