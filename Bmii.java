/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmii;

/**
 *
 * @author ASUS
 */
public class Bmii {
    float berat;
    float tinggi;
    String jenisKelamin;
    
 //   membuat constructor
    public Bmii(float berat , float tinggi){
        this.berat = berat;
        this.tinggi = tinggi;
    }
//    untuk calkulator bmi
    public float hitung(){
        float meter = tinggi / 100;
        return berat / (meter * meter);      
    }

//    status
    public String getStatus(){
        float bmi = hitung();
        if(bmi < 18.5){
            return "Kurus";
        }else if(bmi < 24.9){
            return "Normal";
        }else if(bmi < 26.9){
            return "Berat Ideal";
        }else if(bmi < 27.5){
            return "Berat Berlebih";
        }else{
            return "Obesitas";
        }
    }

    public void getHasil(int pilihanKelamin){
        float bmi = hitung();
        System.out.println("||||Hasil||||");
        jenisKelamin = switch(pilihanKelamin){
            case 1 ->
                "Laki-Laki";
            case 2 ->
                "Perempuan";
            default ->
                "Tidak valid";
        };
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Bmi Farel : " + bmi);
        System.out.println("Status : " + getStatus());
        System.out.println("||||Terimakasih|||||");
    }
}


