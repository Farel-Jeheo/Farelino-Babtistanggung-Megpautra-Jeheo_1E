/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikaa;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari MatematikaCanggih
        MatematikaCanggih matematikaCanggih = new MatematikaCanggih();

        // Menggunakan method pertambahan
        int a = 10;
        int b = 3;
        System.out.println("Pertambahan: " + matematikaCanggih.pertambahan(a, b));

        // Menggunakan method perkalian
        System.out.println("Perkalian: " + matematikaCanggih.perkalian(a, b));

        // Menggunakan method modulus
        System.out.println("Modulus: " + matematikaCanggih.modulus(a, b));
    }
}