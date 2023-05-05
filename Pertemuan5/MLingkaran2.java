/** 
*	File : MLingkaran2.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi cara menghitung luas lingkaran dengan fitur scan
*/

import java.util.Scanner;

public class MLingkaran2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari Lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l2 = new Lingkaran(jejari);
        scan.close();

        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah " + l2.hitungLuas());
    }    
}
