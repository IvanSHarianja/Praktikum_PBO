/** 
*	File : MLingkaran.java 04/05/2023
*	Penulis : Ivan S Harianja
*	Deskripsi menampilkan output dari MLingkaran
*/


public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari " + l.jejari + " adalah " + l.hitungLuas());
    }
    
}
