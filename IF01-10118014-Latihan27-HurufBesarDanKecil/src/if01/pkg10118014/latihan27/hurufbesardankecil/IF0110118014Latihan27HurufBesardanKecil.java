/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118014.latihan27.hurufbesardankecil;
import java.util.Scanner;
/**
 * Nama      : Jovi D Haris
 * Kelas     : IF-1
 * NIM       : 10118014
 * Deskripsi : Formatting kalimat menjadi huruf besar dan kecil
 * @author Jovi
 */

public class IF0110118014Latihan27HurufBesardanKecil {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kalimat = masuk.nextLine();
        String Kapital = kalimat.toUpperCase();
        String Kecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.printf("Huruf Besar\t: %s", Kapital);
        System.out.printf("%nHuruf Kecil\t: %s%n", Kecil);
    }
   
}
